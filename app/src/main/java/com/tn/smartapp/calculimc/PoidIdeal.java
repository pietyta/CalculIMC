package com.tn.smartapp.calculimc;

/**
 * Created by Takwa chaabene on 30/11/2017.
 */

public class PoidIdeal {

    double poid;
    double taille;
    char sexe ;
    String res;
    public PoidIdeal(double poid, double taille, char sexe) {
        this.poid = poid;
        this.taille = taille;
        this.sexe = sexe;
    }

    public double getPoid() {
        return poid;
    }

    public double getTaille() {
        return taille;
    }

    public char getSexe() {
        return sexe;
    }

    public void setTaille(long taille) {
        this.taille = taille;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void setPoid(long poid) {
        this.poid = poid;

    }


    public String imc(){

        String s;
        double im;
        im=this.poid/(this.taille*this.taille);
        res="";
        if(this.sexe=='h'){
            if (im <16.5) res=" trops maigre ";
            if (im >16.5 & im<18.5 ) res=" maigreur ";
            if (im >18.5 & im<25 ) res=" Ideal ";
            if (im >25 & im<30 ) res=" Surpoid ";
            if (im >30 & im<35 ) res=" Obéside Modere ";
            if (im >35 & im<40 ) res=" Obéside Sévère ";
            if (im >40  ) res=" TROP    Obèse";}


        if(this.getSexe()=='f'){
            if (im <16.5) res=" trops maigre ";
            if (im >16.5 & im<18.5 ) res=" maigreur ";
            if (im >18.5 & im<25 ) res=" Ideal ";
            if (im >25 & im<30 ) res=" Surpoid ";
            if (im >30 & im<35 ) res=" Obéside Modere ";
            if (im >35 & im<40 ) res=" Obéside Sévère ";
            if (im >40  ) res=" TROP    Obèse";}
        return  res;
    }
}

