package com.sabel.com.sabel.gefluegelFabrik.gefluegel;

import com.sabel.Gefluegel;

import java.io.InvalidClassException;

public class GefluegelFabrik {

    // Singleton (Darf nur ein Objekt erstelt werden) = Klassenvariable
    private static GefluegelFabrik instance = new GefluegelFabrik();

    // Klassenmethode
    public static GefluegelFabrik createInstance() {
        return GefluegelFabrik.instance;
    } // END STATIC

    public Gefluegel erzeugeGefluegel(String GefluegelTyp) throws InvalidClassException {
        Gefluegel gefluegel = null;
        switch (GefluegelTyp.toLowerCase()) {
            case "vogel":
                gefluegel = new Vogel();
                break;
            case "ente":
                gefluegel = new Ente();
                break;
            default:
                throw new InvalidClassException("Die Klasse ist leider unbekannt");
        } // END SWITCH

        return gefluegel;

    } // END METHOD ERZEUGEGEFLUEGEL

} // END CLASS GEFLUEGELFABRIK
