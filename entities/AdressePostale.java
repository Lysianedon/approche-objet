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

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	//Methodes ici:

}
