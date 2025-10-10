package histoires;

import personnages.Humain;

public class MonHistoire {

	public static void main(String[] args) {
		Humain h = new Humain("Jean", 50, "thé");
		h.direBonjour();
		h.boire();
		h.gagnerArgent(10);
		h.parler("J'ai maintenant " + h.getArgent() + " sous !");
		h.perdreArgent(20);
		h.parler("J'ai maintenant " + h.getArgent() + " sous !");

	}

}
