package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	double[] array = {};

	public void ajout(double x) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = x;

	}
	
	public double calcul() {
		return Arrays.stream(array).sum() / array.length;
	}

}
