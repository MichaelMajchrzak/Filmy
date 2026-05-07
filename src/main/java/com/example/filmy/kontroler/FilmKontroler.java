package com.example.filmy.kontroler;

import com.example.filmy.model.Film;
import com.example.filmy.serwis.FilmSerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmy")
public class FilmKontroler {

    @Autowired
    private FilmSerwis filmSerwis;

    @GetMapping
    public List<Film> pobierzWszystkie() {
        return filmSerwis.pobierzWszystkie();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> pobierzPoId(@PathVariable Long id) {
        return filmSerwis.pobierzPoId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Film dodaj(@RequestBody Film film) {
        return filmSerwis.dodaj(film);
    }

    @PutMapping("/{id}")
    public Film edytuj(@PathVariable Long id, @RequestBody Film film) {
        return filmSerwis.edytuj(id, film);
    }

    @DeleteMapping("/{id}")
    public void usun(@PathVariable Long id) {
        filmSerwis.usun(id);
    }
}
