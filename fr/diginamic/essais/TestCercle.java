package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
	
	public static void main(String[] args) {
		Cercle cercle1 = CercleFactory.getCercle(25);
		Cercle cercle2 = CercleFactory.getCercle(35);
		
		
		System.out.println(cercle1.getPerimetre());
		System.out.println(cercle1.getSurface());	
		System.out.println(cercle2.getPerimetre());
		System.out.println(cercle2.getSurface());
		
	}
}
