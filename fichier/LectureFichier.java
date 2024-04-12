package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {			
		
//		Get the path of the CSV file recensement.csv :
		Path path = Paths.get("/Users/lysianedon/Downloads/recensement.csv");
		List<String> fileContent = Files.readAllLines(path, StandardCharsets.UTF_8);	
		
//		Display the CSV file content in the console:
		for(int i = 1; i < fileContent.size() - 35320; i++) {
			String[] parts = fileContent.get(i - 1).split(";");
			System.out.println("TEST: " + Arrays.toString(parts));
		}
		
	}

}
