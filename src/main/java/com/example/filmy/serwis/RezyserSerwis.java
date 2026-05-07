package com.example.filmy.serwis;

import com.example.filmy.model.Rezyser;
import com.example.filmy.repozytorium.RezyserRepozytorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RezyserSerwis {

    @Autowired
    private RezyserRepozytorium rezyserRepozytorium;

    public List<Rezyser> pobierzWszystkich() {
        return rezyserRepozytorium.findAll();
    }

    public Optional<Rezyser> pobierzPoId(Long id) {
        return rezyserRepozytorium.findById(id);
    }

    public Rezyser dodaj(Rezyser rezyser) {
        return rezyserRepozytorium.save(rezyser);
    }

    public Rezyser edytuj(Long id, Rezyser nowy) {
        nowy.setId(id);
        return rezyserRepozytorium.save(nowy);
    }

    public void usun(Long id) {
        rezyserRepozytorium.deleteById(id);
    }
}
