package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	double salaire;
	
	public Salarie(String nom, String prenom, double salaire, String statut) {
		super(nom, prenom, statut);
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {
		return salaire;
	}

}
