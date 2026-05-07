package com.example.filmy.model;

import jakarta.persistence.*;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tytul;
    private int rok;
    private String opis;

    @ManyToOne
    @JoinColumn(name = "gatunek_id")
    private Gatunek gatunek;

    @ManyToOne
    @JoinColumn(name = "rezyser_id")
    private Rezyser rezyser;

    public Film() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTytul() { return tytul; }
    public void setTytul(String tytul) { this.tytul = tytul; }

    public int getRok() { return rok; }
    public void setRok(int rok) { this.rok = rok; }

    public String getOpis() { return opis; }
    public void setOpis(String opis) { this.opis = opis; }

    public Gatunek getGatunek() { return gatunek; }
    public void setGatunek(Gatunek gatunek) { this.gatunek = gatunek; }

    public Rezyser getRezyser() { return rezyser; }
    public void setRezyser(Rezyser rezyser) { this.rezyser = rezyser; }
}

