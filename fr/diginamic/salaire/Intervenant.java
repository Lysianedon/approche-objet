package fr.diginamic.salaire;

public abstract class Intervenant {

	String nom;
	String prenom;
	String statut;
	
	public Intervenant(String nom, String prenom, String statut) {
		this.nom = nom;
		this.prenom = prenom;
		this.statut = statut;
	}
	
	public abstract double getSalaire();
	
	public void afficherDonnees() {
		System.out.println("Nom: " + nom + " | " + "Prenom: " + prenom + " | " + "Salaire: " + getSalaire() + " | " + "Statut: " + statut);
	};
}
