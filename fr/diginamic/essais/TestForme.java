package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;


public class TestForme {
	
	public static void main(String[] args) {
		Cercle cercle = new Cercle(6);
		Rectangle rectangle = new Rectangle(4, 6);
		Carre carre = new Carre(6);
		
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rectangle);
		AffichageForme.afficher(carre);
	}

}
