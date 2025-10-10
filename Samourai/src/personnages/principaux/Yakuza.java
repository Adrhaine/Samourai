package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant commercant) {
		int argentVole = commercant.seFaireExtorquer();
		gagnerArgent(argentVole);
		reputation ++;
		parler("Je viens d'extorquer " + commercant.getNom() + " et j'ai maintenant " + getArgent() + " sous.");
	}
	
	public void gagnerDuel() {
		reputation += 1;
		parler("J'ai gagné mon duel ! Ma réputation est maintenant de " + reputation + ".");
	}
	
	public int perdreDuel() {
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		reputation --;
		parler("J'ai perdu mon duel est mes " + argentPerdu + " sous, snif.");
		return argentPerdu;
	}
	
	

}
