package fr.diginamic.chaines;

import java.util.Arrays;

import entities.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaineChar = "Durand;Marcel;2 523.5";
//		Get the string's length :
		int lengthString = chaineChar.length();
		int indexFirstSeparation = chaineChar.indexOf(";");
//		Extract the family name (first word):
		String familyName = chaineChar.substring(0,indexFirstSeparation);
		
//		Display the family name in upperCase, then in upperCase:
		System.out.println("Family name in upperCase: " + familyName.toUpperCase());
		System.out.println("Family name in lowerCase: " + familyName.toLowerCase());
		
		String[] arrayString = chaineChar.split(";");
		
//		Display the array of strings:
		System.out.println(Arrays.toString(arrayString));
//		Create a new object from the class Salarie with the different string parts, paying attention to the expected parameters type:
		Salarie salarie = new Salarie(arrayString[0], arrayString[1], Double.parseDouble(arrayString[2].replace(" ", "")));
		
		
	}

}
