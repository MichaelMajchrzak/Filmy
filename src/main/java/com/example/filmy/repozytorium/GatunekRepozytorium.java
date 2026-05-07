package com.example.filmy.repozytorium;

import com.example.filmy.model.Gatunek;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GatunekRepozytorium extends JpaRepository<Gatunek, Long> {
}
