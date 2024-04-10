package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	
	double nbJourTravail;
	double montantSalaireJournalier;
	
	public Pigiste(String nom, String prenom, String statut, double nbJourTravail,double montantSalaireJournalier ) {
		super(nom, prenom, (nbJourTravail * montantSalaireJournalier), statut);
		this.nbJourTravail = nbJourTravail;
		this.montantSalaireJournalier = montantSalaireJournalier;
	}
	

	@Override
	public double getSalaire() {
		return nbJourTravail * montantSalaireJournalier;
	}

}
