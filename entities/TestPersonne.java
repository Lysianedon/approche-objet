package entities;
import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		

		Personne pers1 = new Personne();
		pers1.nom = "Beatrice";
		pers1.prenom = "Luengo";
		pers1.adressePostale.numeroRue = 67;
		pers1.adressePostale.libelleRue = "Rue de Flandre";
		pers1.adressePostale.codePostal = 75020;
		pers1.adressePostale.ville = "Paris";
		
		Personne pers2 = new Personne();
		pers2.nom = "Helene";
		pers2.prenom = "Segara";
		pers2.adressePostale.numeroRue = 7;
		pers2.adressePostale.libelleRue = "Rue de Rivoli";
		pers2.adressePostale.codePostal = 75001;
		pers2.adressePostale.ville = "Paris";

	}

}
