package fr.diginamic.banque.entites;

//Create the Operation class following these instructions:
//a. It must be abstract.
//b. It has two attributes:
//i. the date of the operation (String format for now)
//ii. the amount of the operation.
//c. It has a constructor with two arguments: date and amount.

public abstract class Operation {

	String date;
	private double montant;
	
	public Operation(String date, double montant) {
		this.date = date;
		this.setMontant(montant);
	}

	@Override
	public String toString() {
		return "date=" + date + ", montant=" + getMontant() + " operation=" + getType();
	}
	
//	In the Operation class, add the following abstract method: String getType()
//	a. Redefine this method in the Credit class so that it returns "CREDIT".
//	b. Redefine this method in the Debit class so that it returns "DEBIT".
	
	public abstract String getType();

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	

}
