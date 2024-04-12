package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		int indexnameCity = 6;
		int indexCodeDepartment = 2;
		int indexCodeRegion = 1;
		int indexTotalPopulation = 9;
		
//		Get the path of the CSV file recensement.csv :
		Path path = Paths.get("/Users/lysianedon/Downloads/recensement.csv");
		
//		Extract the first 100 lines of the file and write them down in a new file:
		List<String> first100Lines = Files.lines(path, StandardCharsets.UTF_8).limit(100).collect(Collectors.toList());
		List<String> totalLines = Files.lines(path, StandardCharsets.UTF_8).collect(Collectors.toList());
//		String heading = Files.lines(path, StandardCharsets.UTF_8).findFirst().orElse("");
		String heading = totalLines.remove(0);
		
//		Create a file containing the first 100 lines of the initial CSV file:
		Path pathDestinationSample = Paths.get("/Users/lysianedon/Desktop/recensement-100.csv");
		Files.write(pathDestinationSample, first100Lines);
		
//		//	Create a file containing the final CSV file with the selected columns:
		Path pathDestination = Paths.get("/Users/lysianedon/Desktop/recensement-final.csv");
		
		
//		Create an array of cities of 25k+ inhabitants:
		ArrayList<Ville> citiesArr25k = new ArrayList<Ville>();
		
//		Create city for each line:
		for(int i = 0; i < totalLines.size(); i++) {
			String[] splitLine = totalLines.get(i).split(";");
			String populationString = splitLine[indexTotalPopulation].replaceAll("[^0-9]", "");
			System.out.println(populationString);	
            int population = Integer.parseInt(populationString);
            
            if(population > 25000) {
            	Ville city = new Ville(splitLine[indexnameCity], splitLine[indexCodeDepartment], splitLine[indexCodeRegion], population);
            	citiesArr25k.add(city);
            }  
		}
		
//		Split heading line, and keep the selected columns:
		String[] splitHeading = heading.split(";");
		ArrayList<String> destinationLines = new ArrayList<String>();
		destinationLines.add(splitHeading[6]+";"+splitHeading[2]+";"+splitHeading[1]+";"+splitHeading[9]);
		
//		Loop over the cities and create lines out of them :
		for(Ville city: citiesArr25k)
			destinationLines.add(city.getNom()+";"+city.getCodeDepartement()+";"+city.getNomRegion()+";"+city.getPopulationTotale());
		
//		Add the lines to the destination file:
		Files.write(pathDestination, destinationLines);

	}
	

}
