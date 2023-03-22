package com.exercice.core;

import java.util.function.Function;

public class Produit {
    private String libelle;
    private double pourcentage;
    private double price;

    public Produit(String libelle, double pourcentage, double price) {
        this.libelle = libelle;
        this.pourcentage = pourcentage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
            " libelle='" + getLibelle() + "'" +
            ", pourcentage='" + getPourcentage() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPourcentage() {
        return this.pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
