package fr.diginamic.entites;

import java.util.Optional;

public class Theatre {
	String name;
	private int maxCapacity;
	private int totalClients;
	private double totalProfit;
	
	
//	Constructor
	public Theatre(String name, int maxCapacity) {
		this.name = name;
		this.maxCapacity = maxCapacity;
	}
	
//	Methods
	
	public void inscrire(int nbClients, double priceTicket) {
		boolean maxCapacityReached = maxCapacity == totalClients ;
		
		if(maxCapacityReached || nbClients + totalClients > maxCapacity ) {
			System.out.println("Erreur: nombre de places disponibles insuffisant: " + (maxCapacity - totalClients) + " places restantes." );
			return;
		}
		
		totalClients += nbClients;
		totalProfit += priceTicket * nbClients;
	}

// Getters and setters
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMaxCapacity() {
		return maxCapacity;
	}


	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}


	public int getTotalClients() {
		return totalClients;
	}


	public void setTotalClients(int totalClients) {
		this.totalClients = totalClients;
	}


	public double getTotalProfit() {
		return totalProfit;
	}


	public void setTotalProfit(double totalProfit) {
		this.totalProfit = totalProfit;
	}


//	public boolean isMaxCapacityReached() {
//		return maxCapacityReached;
//	}
//
//
//	public void setMaxCapacityReached(boolean maxCapacityReached) {
//		this.maxCapacityReached = maxCapacityReached;
//	}
	
	

}
