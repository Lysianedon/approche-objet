package maps;

public class Pays {
	private String nom;
	private long nbHabitants;
	private String continent;
	
	public Pays(String nom, long nbHabitants, String continent) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

//	Getters and Setters : 
	public String getNom() {
		return nom;
	}
	
	public String setNom(String nom) {
		return this.nom = nom;
	}
	
	public long getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
