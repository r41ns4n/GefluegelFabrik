package com.sabel;

import com.sabel.com.sabel.gefluegelFabrik.gefluegel.Ente;
import com.sabel.com.sabel.gefluegelFabrik.gefluegel.GefluegelFabrik;

public class JMain {
    public static void main(String[] args) {
        GefluegelFabrik gf = GefluegelFabrik.createInstance();
        GefluegelFabrik gf2 = GefluegelFabrik.createInstance();

        if (gf == gf2) {
            System.out.println("gleich");
        } else {
            System.out.println("ungleich");
        }

        try {
            Gefluegel gefluegel1 = gf.erzeugeGefluegel("Ente");
            gefluegel1.fliegen();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Gefluegel gefluegel2 = gf.erzeugeGefluegel("Vogel");
            gefluegel2.fliegen();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Gefluegel gefluegel3 = gf.erzeugeGefluegel("Hase");
            gefluegel3.fliegen();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Gefluegel gefluegel4 = new Ente(); JMAIN ist nicht in der gleichen Klasse wie Ente, somit nicht möglich


    } // END JMAIN

} // END CLASS JMAIN
