package com.fasttrackit;

public class Casa extends Locuinta {
    private int nrEtaje;

    public Casa() {
    }
    public Casa(int nrEtaje) {
        this.nrEtaje = nrEtaje;
    }
    public int getNrEtaje() {
        return nrEtaje;
    }
    public void setNrEtaje(int nrEtaje) {
        this.nrEtaje = nrEtaje;
    }
}
