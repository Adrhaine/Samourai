package histoires;

import personnages.Humain;
import personnages.principaux.*;

public class MonHistoire {

    public static void main(String[] args) {
        System.out.println("=== Introduction des personnages ===");
        
        Humain h = new Humain("Jean", 50, "thé");
        Commercant com = new Commercant("Pierre", 20);
        Yakuza y = new Yakuza("Takeda", 50, "sake", "Dragon");
        Ronin r = new Ronin("Hattori", 30, "sake");
        
        h.direBonjour();
        com.direBonjour();
        y.direBonjour();
        r.direBonjour();
        
        System.out.println("\n=== Jean boit et joue avec son argent ===");
        h.boire();
        h.gagnerArgent(10);
        h.parler("Maintenant j'ai " + h.getArgent() + " sous !");
        h.perdreArgent(20);
        h.parler("Oups, il me reste " + h.getArgent() + " sous !");
        
        System.out.println("\n=== Yakuza extorque le commerçant ===");
        y.extorquer(com);
        com.direBonjour();
        y.direBonjour();
        
        System.out.println("\n=== Ronin aide le commerçant et le défie en duel ===");
        r.donner(10, com); // Ronin donne de l'argent au commerçant
        r.provoquer(y);     // Ronin défie le Yakuza
        r.direBonjour();
        com.direBonjour();
        y.direBonjour();
        
        System.out.println("\n=== Nouveaux duels pour voir l’évolution ===");
        r.provoquer(y);     // Un second duel
        r.direBonjour();
        com.direBonjour();
        y.direBonjour();
        
        System.out.println("\n=== Fin de l’histoire ===");
        h.direBonjour();
        com.direBonjour();
        y.direBonjour();
        r.direBonjour();
    }
}
