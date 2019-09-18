package com.fasttrackit;

public class CasaVacanta extends Locuinta {
    private String tipIncalzire;
    public CasaVacanta() {
    }
    public CasaVacanta(String tipIncalzire){
        this.tipIncalzire=tipIncalzire;
    }
    public String getTipIncalzire() {
        return tipIncalzire;
    }
    public void setTipIncalzire(String tipIncalzire) {
        this.tipIncalzire = tipIncalzire;
    }


}

