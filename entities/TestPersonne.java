package entities;
import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		
		AdressePostale adresse1 = new AdressePostale(67, "Rue de Flandre", 75020, "Paris" );		
		AdressePostale adresse2 = new AdressePostale(627, "Rue Hachis", 75006, "Paris");

		Personne pers1 = new Personne("Beatrice","Luengo", adresse1);		
		Personne pers2 = new Personne("Helene", "Segara", adresse2);

	}

}
