package tri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import fichier.Ville;

public class TriVilles {

	public static void main(String[] args) throws IOException {
		ArrayList<Ville> citiesList = new ArrayList<Ville>();
		
		Path originalPath = Paths.get("/Users/lysianedon/Desktop/recensement-final.csv");
		List<String> originalLines = Files.lines(originalPath, StandardCharsets.UTF_8).collect(Collectors.toList());
		String heading = originalLines.remove(0);
		
//		Create cities out of the lines:
		for(String line : originalLines) {
			String[] splitLine = line.split(";");
//			System.out.println(line);
			String populationString = splitLine[3].replaceAll("[^0-9]", "");
            int population = Integer.parseInt(populationString);
			
            Ville city = new Ville(splitLine[0], splitLine[1], splitLine[2], population);
			citiesList.add(city);
		}
		
//		Sort the cities by their name, then by their nb of inhabitants (exo 3):
		Collections.sort(citiesList);
		System.out.println(citiesList);	
		

	}

}
