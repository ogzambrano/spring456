package com.example.ejercicio456.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Laptop{
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String market;
    private String model;
    private LocalDate releaseDate;
    private Boolean online;

    //constructor
    public Laptop() {
    }

    public Laptop(String market, String model, LocalDate releaseDate, Boolean online) {
        this.market = market;
        this.model = model;
        this.releaseDate = releaseDate;
        this.online = online;
    }

    //getter y setter

    public long getId() {
        return id;
    }

    public String getMarket() {
        return market;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }
}
