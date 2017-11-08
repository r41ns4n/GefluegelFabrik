package com.sabel.com.sabel.gefluegelFabrik.gefluegel;

import com.sabel.Gefluegel;

public class Ente implements Gefluegel {

    Ente() {
        super();
    } // END CONSTRUCTOR PACKETSICHER (nur Klassen im selben Packet dürfen den Konstruktor ausführen)

    @Override
    public void fliegen() {
        System.out.println("Gack, gack");
    }

} // END CLASS ENTE
