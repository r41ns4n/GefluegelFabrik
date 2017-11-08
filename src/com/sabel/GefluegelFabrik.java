package com.sabel;

import java.io.InvalidClassException;

public class GefluegelFabrik {

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
