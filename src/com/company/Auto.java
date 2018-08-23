package com.company;


public class Auto {

    private String nummerplaat;
    private String bestuurder;


    public Auto(String bestuurder, String nummerplaat) {

        this.nummerplaat = nummerplaat;
        this.bestuurder = bestuurder;

    }


    public String getNummerplaat() {

        return this.nummerplaat;
    }

    public String getBestuurder() {

        return this.bestuurder;
    }
}
