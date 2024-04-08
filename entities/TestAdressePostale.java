package entities;
import entities.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 67;
		adresse1.libelleRue = "Rue Brochant";
		adresse1.codePostal = 75015;
		adresse1.ville = "Paris";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroRue = 627;
		adresse2.libelleRue = "Rue Hachis";
		adresse2.codePostal = 75006;
		adresse2.ville = "Paris";
		
		System.out.println(adresse1.toString());
		

	}

}

