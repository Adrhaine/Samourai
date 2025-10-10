package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		int argentperdu = super.getArgent();
		perdreArgent(argentperdu);
		parler("Le monde est vraiment trop injuste !");
		return argentperdu;
	}
	
	public void recevoir(int n) {
		gagnerArgent(n);
		parler("Merci généreux donateur !");
	}

}
