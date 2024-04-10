package fr.diginamic.banque.entites;

//Create the Debit class:
//a. It inherits from Operation.

public class Credit extends Operation {
	
	
	public Credit(String date, double montant) {
		super(date, montant);
		
	}
//	Redefine the getType method in the Credit class so that it returns "CREDIT".
	public String getType() {
		return "CREDIT";
	}
	
	
}
