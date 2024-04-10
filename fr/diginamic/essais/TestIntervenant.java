package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Intervenant salarie = new Salarie("Broue", "Pierre", 789.0, "Cadre");
		Intervenant pigiste = new Pigiste( "Noel", "Henri","CDD", 6, 56.98);
		
		System.out.println("Salaire salarié: " + salarie.getSalaire());
		salarie.afficherDonnees();
		
		System.out.println("Salaire pigiste: " + pigiste.getSalaire());
		pigiste.afficherDonnees();
		
	}

}
