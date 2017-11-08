package com.sabel.com.sabel.gefluegelFabrik.gefluegel;

import com.sabel.Gefluegel;

public class Vogel implements Gefluegel {

    Vogel() {
        super();
    } // END CONSTRUCTOR PACKETSICHER (nur Klassen im selben Packet dürfen den Konstruktor ausführen)

    @Override
    public void fliegen() {
        System.out.println("Piep, piep");
    }

} // END CLASS VOGEL
