package entities2;
import entities.AdressePostale;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adressePostale = new AdressePostale();
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
}
