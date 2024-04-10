package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		
		Maison maison = new Maison();
		Chambre chambre1 = new Chambre(20, 1);
		Chambre chambre2 = new Chambre(60, 1);
		Cuisine cuisine = new Cuisine (35, 0);
		Salon salon = new Salon(75, 0);
		SalleDeBain sdb = new SalleDeBain(55, 1);
		WC wc = new WC(34, 0);
		WC wc2 = new WC(28, 1);
		
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(sdb);
		maison.ajouterPiece(wc);
		maison.ajouterPiece(wc2);
		maison.ajouterPiece(null);
		
		System.out.println(maison.getSuperficieTotale());
		System.out.println(maison.getSuperficieEtage(1));
		System.out.println(maison.getSuperficieTotalePiece("wc"));
		System.out.println(maison.getNbPieceParType("chambre"));
		

	}

}
