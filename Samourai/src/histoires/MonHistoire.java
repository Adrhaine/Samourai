package histoires;

import personnages.Humain;
import personnages.principaux.*;

public class MonHistoire {

	public static void main(String[] args) {
        // Création d'un Humain
        Humain humain = new Humain("Prof", 10, "Porto");
        humain.direBonjour();
        humain.boire();

        // Création d'un Commercant
        Commercant commercant = new Commercant("Marchand", 35);
        commercant.direBonjour();

        // Création d'un Yakuza
        Yakuza yakuza = new Yakuza("Yaku le noir", 42, "bière", "WarSong");
        yakuza.direBonjour();

        // Yakuza extorque le commerçant
        yakuza.extorquer(commercant);

        // Création d'un Ronin
        Ronin ronin = new Ronin("Roro", 61, "sake");
        ronin.donner(10, commercant);
        ronin.provoquer(yakuza);
        ronin.direBonjour();
    }

}
