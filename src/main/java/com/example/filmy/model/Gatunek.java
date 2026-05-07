package com.example.filmy.model;


import jakarta.persistence.*;

@Entity
public class Gatunek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;

    public Gatunek() {}

    public Gatunek(String nazwa) {
        this.nazwa = nazwa;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNazwa() { return nazwa; }
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }
}

