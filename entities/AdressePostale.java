package entities;

public class AdressePostale {
	// Attributs d'instances => variables globales
	int numeroRue; 
	String libelleRue;
	int codePostal;
	String ville;

	//Constructeurs:
	public AdressePostale() {

	}

	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue; // on valorise les variables avec les paramètres du constructeur
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;

	}
	
	//Methodes ici:

}
