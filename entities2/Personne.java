package entities2;

import entities.AdressePostale;

public class Personne {
//Attributs d'instance:
	private String nom;
	private String prenom;
	private AdressePostale adressePostale = new AdressePostale();

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
//	Constructeurs:

	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom; // On utilise "this" pour retirer les ambigüités de nommage
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
//	Methodes:
	public void printIdentity() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}
	
	public void setFirstName(String prenom) {
		this.prenom = prenom;
	}
	public void setLastName(String nom) {
		this.nom = nom;
	}
	public void setAddress(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}
	public String getLastName() {
		return nom;
	}
	public String getFirstName() {
		return prenom;
	}
	public AdressePostale getAddress() {
		return adressePostale;
	}
}

