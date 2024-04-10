package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private double tauxRemuneration;
	
	public CompteTaux(int numero, double solde, double tauxRemuneration) {
		super(numero, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return super.toString() + " tauxRemuneration=" + tauxRemuneration;
	}
	
	
	
	
	

}
