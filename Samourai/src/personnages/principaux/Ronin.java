package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}
	
	public int getHonneur() {
		return this.honneur;
	}
	
	// Donner de l'argent à un marchand.
	public void donner(int n, Commercant c) {
		if (getArgent() > n) {
			perdreArgent(n);
			c.recevoir(n);
			parler("J'ai donné " + n + " sous à " + c.getNom() + ".");
		} else {
			parler("Je n'ai pas assez d'argent pour donner " + n + " sous à " + c.getNom() + "...");
		}
	}
	
	// Provoquer un Yakuza
	public void provoquer(Yakuza y) {
		parler("Je défie " + y.getNom() + " du clan " + y.getClan() + " en duel !");
		if (honneur * 2 >= y.getReputation()) {
			//Ronin gagne
			int argentVole = y.perdreDuel();
			gagnerArgent(argentVole);
			honneur ++;
			parler("Victoire ! J'ai gagné " + argentVole + " sous et mon honneur est maintenant " + honneur + ".");
		} else {
			//Ronin perd
			int argentPerdu = getArgent();
			perdreArgent(argentPerdu);
			honneur --;
			y.gagnerDuel();
			parler("Défaite... J'ai perdu " + argentPerdu + " sous et mon honneur est maintenant " + honneur + " !");
		}
	}

}
