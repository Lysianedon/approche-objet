package entities;


public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale(67, "Rue Brochant", 75015, "Paris");
		AdressePostale adresse2 = new AdressePostale(627, "Rue Hachis", 75006, "Paris" );

		System.out.println(adresse1.codePostal);
		

	}

}

