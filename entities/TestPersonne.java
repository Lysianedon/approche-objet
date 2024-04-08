package entities;
import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroRue = 627;
		adresse2.libelleRue = "Rue Hachis";
		adresse2.codePostal = 75006;
		adresse2.ville = "Paris";
		
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 67;
		adresse1.libelleRue = "Rue de Flandre";
		adresse1.codePostal = 75020;
		adresse1.ville = "Paris";
		
		

		Personne pers1 = new Personne();
		pers1.nom = "Beatrice";
		pers1.prenom = "Luengo";
		pers1.adressePostale = adresse1;
	
		
		Personne pers2 = new Personne();
		pers2.nom = "Helene";
		pers2.prenom = "Segara";
		pers2.adressePostale.numeroRue = 7;
		pers2.adressePostale = adresse2;

	}

}
