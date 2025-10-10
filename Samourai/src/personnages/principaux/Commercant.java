package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		
	}
	
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		super.parler("J'ai reçu " + argent + " sous.");
	}

}
