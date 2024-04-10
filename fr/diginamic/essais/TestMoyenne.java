package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne c1 = new CalculMoyenne();
		c1.ajout(6);
		c1.ajout(4);
		c1.ajout(2);
		double result = c1.calcul();
		
		System.out.println(result);
		

	}

}
