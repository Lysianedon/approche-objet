package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Opera", 29);
		
		theatre.inscrire(6, 19.95);
		theatre.inscrire(6, 19.95);
		theatre.inscrire(6, 19.95);
		theatre.inscrire(6, 19.95);
		theatre.inscrire(6, 19.95);
		
		System.out.println("total clients: " + theatre.getTotalClients());
		System.out.println("total profit: " + theatre.getTotalProfit());
		
	}

}
