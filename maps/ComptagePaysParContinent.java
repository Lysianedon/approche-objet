package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> countries = new ArrayList<Pays>();
		Collections.addAll(countries, 
				new Pays("France", 65, "Europe"),
				new Pays("Allemagne", 80, "Europe"),
				new Pays("Belgique", 10, "Europe"),
				new Pays("Russie", 150, "Asie"),
				new Pays("Chine", 14000000000l, "Asie"),
				new Pays("Indonésie", 220000000, "Océanie"),
				new Pays("Australie", 20000000, "Océanie")
				);
		
		HashMap<String, Integer> nbCountriesPerContinent = new HashMap <>();
		
		for(int i = 0 ; i < countries.size(); i++) {
			String continent = countries.get(i).getContinent();
			
			if(nbCountriesPerContinent.containsKey(continent)) {
				int continentCount = nbCountriesPerContinent.get(continent);
				nbCountriesPerContinent.put(continent, continentCount + 1);
			} else {
				nbCountriesPerContinent.put(continent, 1);
			}
		}
		
		System.out.println(nbCountriesPerContinent);
	}

}
