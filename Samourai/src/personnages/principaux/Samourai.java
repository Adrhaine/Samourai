package personnages.principaux;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	public String getSeigneur() {
        return seigneur;
    }
	
	public void boire(String boisson) {
        parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
    }
	
	@Override
    public void direBonjour() {
        super.direBonjour(); // Appel à Ronin -> Humain pour les infos de base
        parler("Je sers le seigneur " + seigneur + " et j'en suis fier !");
    }

}
