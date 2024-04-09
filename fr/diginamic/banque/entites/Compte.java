package fr.diginamic.banque.entites;

public class Compte {

	private int numero = 56;
	private double solde = 789.9;

	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
//	Redefine a method inherited from the Object class, namely the toString() method:
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	

}
