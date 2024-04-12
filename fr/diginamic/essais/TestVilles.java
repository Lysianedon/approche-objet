package fr.diginamic.essais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import listes.Ville;

public class TestVilles {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<Ville>();
		Collections.addAll(villes, 
				new Ville("Nice", 343000), 
				new Ville("Carcassonne",47800),
				new Ville("Narbonne", 53400),
				new Ville("Lyon", 484000),
				new Ville("Foix", 9700),
				new Ville("Pau", 77200),
				new Ville("Marseille", 850700),
				new Ville("Tarbes", 40600)		
				);
		
		Ville biggestCity = villes.get(0);
		Ville smallestCity = villes.get(0);
		
		for(Ville ville : villes) {
			biggestCity =  ville.getNbHabitants() > biggestCity.getNbHabitants() ? ville : biggestCity; 
			smallestCity =  ville.getNbHabitants() < smallestCity.getNbHabitants() ? ville : smallestCity; 
		}
		
		System.out.println("The most populated city is: "+ biggestCity.getNom() + " with " + biggestCity.getNbHabitants() + " inhabitants.");
		System.out.println("The least populated city is: "+ smallestCity.getNom() + " with " + smallestCity.getNbHabitants() + " inhabitants.");
		
//		Delete the least populated city + write the name of the city of 100K+ inhabitants in uppercase:
		Iterator<Ville> filteredCities = villes.iterator();
		while(filteredCities.hasNext()) {
			Ville city = filteredCities.next();
			if(city.getNbHabitants() > 100000) city.setNom(city.getNom().toUpperCase());
			if(city.equals(smallestCity)) filteredCities.remove();
		}
//		Display the final result:
		System.out.println( "Final result: ");	
		for(Ville ville : villes) System.out.println( ville.getNom() + " | " + ville.getNbHabitants());	

	}

}
