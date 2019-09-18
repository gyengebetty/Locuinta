package com.fasttrackit;

public class Locuinta {
    int anulConstructiei;
    String adresa;
    int nrCamere;
    int suprafata;

    public Locuinta() {
    }
    public Locuinta(int anulConstructiei) {
        this.anulConstructiei = anulConstructiei;
    }
    public int getAnulConstructiei() {
        return anulConstructiei;
    }
    public void setAnulConstructiei(int anulConstructiei) {
        this.anulConstructiei = anulConstructiei;
    }
    public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    public int getNrCamere() {
        return nrCamere;
    }
    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }
    public int getSuprafata() {
        return suprafata;
    }
    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }
}
