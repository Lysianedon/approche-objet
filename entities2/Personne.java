package entities2;

import entities.AdressePostale;

public class Personne {
//Attributs d'instance:
	public String nom;
	public String prenom;
	public AdressePostale adressePostale = new AdressePostale();

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
	
	public void updateFirstName(String prenom) {
		this.prenom = prenom;
	}
	public void updateLastName(String nom) {
		this.nom = nom;
	}
	public void updateAddress(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}
	public String displayLastName() {
		return nom;
	}
	public String displayFirstName() {
		return prenom;
	}
	public AdressePostale displayAddress() {
		return adressePostale;
	}
}

