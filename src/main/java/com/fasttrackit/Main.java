package com.fasttrackit;

public class Main {
    public static void main(String[] args) {
        Apartament ap=new Apartament();
        ap.setAdresa("str.Libertati");
        ap.setAnulConstructiei(2001);
        ap.setNrCamere(3);
        ap.setSuprafata(35);
        ap.setEtaj(2);

        Apartament ap1=new Apartament();
        ap1.setAdresa("Str.Aluminei");
        ap1.setAnulConstructiei(1999);
        ap1.setNrCamere(5);
        ap1.setSuprafata(60);
        ap1.setEtaj(4);

        Casa c1=new Casa();
        c1.setAdresa("str Principala");
        c1.setAnulConstructiei(1989);
        c1.setNrCamere(3);
        c1.setSuprafata(49);
        c1.setNrEtaje(2);

        Casa c2=new Casa();
        c2.setAdresa("Str.Mare");
        c2.setAnulConstructiei(1998);
        c2.setNrCamere(5);
        c2.setSuprafata(60);
        c2.setNrEtaje(3);

        CasaVacanta cv=new CasaVacanta();
        cv.setAdresa("Str Victoriei");
        cv.setAnulConstructiei(2002);
        cv.setNrCamere(2);
        cv.setSuprafata(39);
        cv.setTipIncalzire("Gaz");

        CasaVacanta cv1=new CasaVacanta();
        cv1.setAdresa("Str.Gari");
        cv1.setAnulConstructiei(2006);
        cv1.setNrCamere(3);
        cv1.setSuprafata(45);
        cv1.setTipIncalzire("Lemn");
    }
}
