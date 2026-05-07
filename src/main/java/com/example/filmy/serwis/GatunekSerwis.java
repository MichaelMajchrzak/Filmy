package com.example.filmy.serwis;

import com.example.filmy.model.Gatunek;
import com.example.filmy.repozytorium.GatunekRepozytorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GatunekSerwis {

    @Autowired
    private GatunekRepozytorium gatunekRepozytorium;

    public List<Gatunek> pobierzWszystkie() {
        return gatunekRepozytorium.findAll();
    }

    public Optional<Gatunek> pobierzPoId(Long id) {
        return gatunekRepozytorium.findById(id);
    }

    public Gatunek dodaj(Gatunek gatunek) {
        return gatunekRepozytorium.save(gatunek);
    }

    public Gatunek edytuj(Long id, Gatunek nowy) {
        nowy.setId(id);
        return gatunekRepozytorium.save(nowy);
    }

    public void usun(Long id) {
        gatunekRepozytorium.deleteById(id);
    }
}
