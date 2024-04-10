package fr.diginamic.entites;

public class Cercle {
	
	double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double getPerimetre() {
		return 2 * Math.PI * rayon;
	}
	public double getSurface() {
		return Math.PI * rayon; //Exposant 2 manquant sur rayon
	}

}
