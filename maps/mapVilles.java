package maps;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import fichier.Ville;

public class mapVilles {

	public static void main(String[] args) throws IOException {
		
		int indexnameCity = 6;
		int indexPopulationCity = 7;
		
//		Create a map which will store cities (valuses) according to their names (key):
		HashMap<String, Ville> mapCities = new HashMap<>();
		HashMap<String, Ville> sortedCities = new HashMap<>();
		
//		Import cities CSV file:
		Path path = Paths.get("/Users/lysianedon/Downloads/recensement.csv");
		
//		Extract lines and store them in ArrayList:
		List<String> linesOriginalFile = Files.readAllLines(path, StandardCharsets.UTF_8);
		String heading = linesOriginalFile.remove(0);
		
//		Store the cities in hashmap:
		linesOriginalFile.forEach(c -> {
			
			String[] splitLine = c.split(";");
//			System.out.println(line);
			String populationString = splitLine[indexPopulationCity].replaceAll("[^0-9]", "");
            int population = Integer.parseInt(populationString);
            String cityName = splitLine[indexnameCity];
			mapCities.put(cityName, new Ville(cityName, population));
		});
		
//		Sort the cities by their population and delete the least populated one :
		List<Ville> citiesList = new ArrayList<>(mapCities.values());
		Collections.sort(citiesList);
		Ville leastPopulatedCity = citiesList.get(0);
//		System.out.println("sorted list: " + citiesList);
		
		if(!mapCities.isEmpty()) {
			for(Ville c : citiesList) 
				if(c.getPopulationTotale() == leastPopulatedCity.getPopulationTotale()) {
//					System.out.println("Removing city: " + c.getNom());
					mapCities.remove(c.getNom());
					
				} 
		} 
		
//		Display the remaining cities:
		System.out.println("final list: " + mapCities);
		
	}

}
