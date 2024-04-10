package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte = new Compte(6, 78.88);
		
		Compte c1 = new Compte(78, 3248.7);
		CompteTaux c2 = new CompteTaux(568, 1148.7, 10);
		Compte[] compteArr = {c1, c2};
		
		for (int i = 0; i < compteArr.length; i++) {
			System.out.println(compteArr[i]);
		}

	}

}

