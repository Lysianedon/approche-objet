package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double addition = Operations.calcul(3, 4, "+");
		double soustraction = Operations.calcul(9, 5, "-");
		double multiplication = Operations.calcul(8,  12,  "*");
		double division = Operations.calcul(78, 2, "/");
		
		System.out.println("addition: "+ addition + " soustraction: "  + soustraction + " multiplication: " + multiplication + " division: " + division);
	}

}
