package fichier;



public class Ville implements Comparable<Ville>{
	private String nom;
	private String codeDepartement;
	private String nomRegion;
	private int populationTotale;
	
	
	public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.populationTotale = populationTotale;
	}
	
	
	@Override
	public int compareTo(Ville nextVille) {
//		Sort by population (exo 3): 
		if(this.populationTotale > nextVille.getPopulationTotale()) {
			return  1;
		} else if(this.populationTotale < nextVille.getPopulationTotale()) {
			return  - 1;
		}
		return 0;
//		Sort by name (exo 1):
//		return this.nom.compareTo(nextVille.getNom());
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", codeDepartement=" + codeDepartement + ", nomRegion=" + nomRegion
				+ ", populationTotale=" + populationTotale + "]";
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getCodeDepartement() {
		return codeDepartement;
	}


	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}


	public String getNomRegion() {
		return nomRegion;
	}


	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}


	public double getPopulationTotale() {
		return populationTotale;
	}


	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	
	

}
