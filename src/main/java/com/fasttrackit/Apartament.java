package com.fasttrackit;

public class Apartament extends Locuinta {
   private int etaj;

    public Apartament() {
    }
    public Apartament(int etaj) {
        this.etaj = etaj;
    }
    public int getEtaj() {
        return etaj;
    }
    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }
}
