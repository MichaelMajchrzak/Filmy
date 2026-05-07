package com.example.filmy.serwis;

import com.example.filmy.model.Film;
import com.example.filmy.repozytorium.FilmRepozytorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmSerwis {

    @Autowired
    private FilmRepozytorium filmRepozytorium;

    public List<Film> pobierzWszystkie() {
        return filmRepozytorium.findAll();
    }

    public Optional<Film> pobierzPoId(Long id) {
        return filmRepozytorium.findById(id);
    }

    public Film dodaj(Film film) {
        return filmRepozytorium.save(film);
    }

    public Film edytuj(Long id, Film nowy) {
        nowy.setId(id);
        return filmRepozytorium.save(nowy);
    }

    public void usun(Long id) {
        filmRepozytorium.deleteById(id);
    }
}
