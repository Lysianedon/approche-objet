package fr.diginamic.banque;

//Create an executable TestOperation class:
//a. Create an array of operations with at least 4 credit and debit operations in the array.
//b. Loop over the operations array to display the following information:
//i. The date of the operation
//ii. The amount of the operation.

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		Credit credit1 = new Credit("10/04/2024", 150);
		Credit credit2 = new Credit("07/08/2024", 240);
		Debit debit1 = new Debit("23/06/2024", 10.4);
		Debit debit2 = new Debit("03/10/2024", 20.9);
		
		double total = 0;
		
		Operation[] operationArr = {credit1, credit2, debit1, debit2};
		
		for (int i = 0; i < operationArr.length; i++) {
			System.out.println(operationArr[i]);
			
//			Calculate the total amount of all operations:	
			total = operationArr[i].getType() == "CREDIT" ? 
					total + operationArr[i].getMontant() : total - operationArr[i].getMontant() ;
		}
		
		
		System.out.println("Montant total après opérations: " + total);
		

	}

}
