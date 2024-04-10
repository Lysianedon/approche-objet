package fr.diginamic.banque.entites;

//Create the Debit class:
//a. It inherits from Operation.

public class Debit extends Operation {

	public Debit(String date, double montant) {
		super(date, montant);
	}
	
//	Redefine the getType method in the Debit class so that it returns "DEBIT".
	public String getType() {
		return "DEBIT";
	}
		
}
