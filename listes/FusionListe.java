package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class FusionListe {

	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Marron");
		liste2.add("Jaune");
		
		List<String> liste3 = new ArrayList<String>();
		
		for(String s: liste1) liste3.add(s);
		
		// Get the iterator
	    Iterator<String> colors = liste2.iterator();
	    while(colors.hasNext()) {
	    	String color = colors.next();
	    	liste3.add(color);
	    }
	    
	    System.out.println(liste3);
		
	}

}
