package histoires;

import personnages.Humain;
import personnages.principaux.*;

public class MonHistoireTest {

    public static void main(String[] args) {
        System.out.println("=== Introduction des personnages ===");
        
        Humain h = new Humain("Jean", 50, "thé");
        Commercant com = new Commercant("Pierre", 20);
        Yakuza y = new Yakuza("Takeda", 50, "sake", "Dragon");
        Ronin r = new Ronin("Hattori", 30, "sake");
        Samourai s = new Samourai("Akimoto", 25, "thé", "Miyamoto");
        
        h.direBonjour();
        com.direBonjour();
        y.direBonjour();
        r.direBonjour();
        s.direBonjour();
        
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
        
        System.out.println("\n=== Samourai montre ses capacités ===");
        s.boire();                 // Boit sa boisson favorite
        s.boire("bière");          // Boit n’importe quelle boisson
        s.direBonjour();           // Annonce son seigneur
        ((Ronin) s).provoquer(y);  // Polymorphisme : Samourai vu comme Ronin provoque le Yakuza
        s.direBonjour();
        
        System.out.println("\n=== Nouveaux duels pour voir l’évolution ===");
        r.provoquer(y);     // Un second duel
        ((Samourai) s).provoquer(y); //Samourai provoque le yakuza à nouveau
        r.direBonjour();
        com.direBonjour();
        y.direBonjour();
        
        System.out.println("\n=== Fin de l’histoire ===");
        h.direBonjour();
        com.direBonjour();
        y.direBonjour();
        r.direBonjour();
        s.direBonjour();
    }
}
