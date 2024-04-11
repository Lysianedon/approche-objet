package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestListeString {

	public static void main(String[] args) {
		 
		ArrayList<String> citiesArr = new ArrayList<>();
		Collections.addAll(citiesArr, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
		System.out.println(citiesArr);

//		Look for the city which has the largest number of letters:
		String longestCity = citiesArr.get(0);	
		for(String city : citiesArr) longestCity = longestCity.length() > city.length() ? longestCity : city;
		
		System.out.println(longestCity);
		
//		Turn cities into upper case:	
	for(int i = 0; i < citiesArr.size(); i++) {
		String city = citiesArr.get(i);
		citiesArr.set(i, city.toUpperCase());
	}
		System.out.println(citiesArr);
		
		
//		Delete cities starting with a "n":
		Iterator<String> filteredCities = citiesArr.iterator();
		while(filteredCities.hasNext()) {
			String city = filteredCities.next();
			if(city.startsWith("n")|| city.startsWith("N")) filteredCities.remove();
		}
		
		System.out.println( "Final result: " + citiesArr);	
	}
}
