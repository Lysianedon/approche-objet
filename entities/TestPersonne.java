package entities;

import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adresse1 = new AdressePostale(67, "Rue de Flandre", 75020, "Paris");
		AdressePostale adresse2 = new AdressePostale(627, "Rue Hachis", 75006, "Paris");

		Personne pers1 = new Personne("Beatrice", "Luengo", adresse1);
		pers1.updateFirstName("Bea");
		pers1.updateLastName("Lu");
		pers1.updateAddress(adresse2);
		pers1.printIdentity();
		System.out.println(pers1.displayLastName());
		System.out.println(pers1.displayFirstName());
		System.out.println(pers1.displayAddress());
		
		Personne pers2 = new Personne("Helene", "Segara", adresse2);

	}

}
