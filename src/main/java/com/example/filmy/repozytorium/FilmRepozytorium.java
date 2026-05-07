package com.example.filmy.repozytorium;

import com.example.filmy.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepozytorium extends JpaRepository<Film, Long> {
}
