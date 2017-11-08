package com.sabel;

public class JMain {
    public static void main(String[] args) {
        GefluegelFabrik gf = new GefluegelFabrik();
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



    } // END JMAIN

} // END CLASS JMAIN
