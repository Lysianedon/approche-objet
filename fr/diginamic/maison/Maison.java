package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	
	Piece[] piecesMaison = {};
	
	public void ajouterPiece(Piece piece) {
		if(piece != null && piece.getSuperficie() >= 0 && piece.getEtage() >= 0) {	
			piecesMaison = Arrays.copyOf(piecesMaison, piecesMaison.length + 1);
			piecesMaison[piecesMaison.length - 1] = piece;
		}
	}
	
	public double getSuperficieTotale() {
		double total = 0;
		
		for(int i = 0; i < piecesMaison.length; i++) {
			total += piecesMaison[i].getSuperficie();
		}
			
		return total;
	}
	
	public double getSuperficieEtage(int etage) {
		double total = 0;
		Piece[] piecesEtage = Arrays.stream(piecesMaison).filter(p -> p.getEtage() == etage).toArray(Piece[]:: new);
		
		for(int i = 0; i < piecesEtage.length; i++) {
			total += piecesEtage[i].getSuperficie();
		}
			
		return total;
	}
	
	public double getSuperficieTotalePiece(String type) {	
		double total = 0;
		Piece[] filteredPieceArr = Arrays.stream(piecesMaison)
				.filter(p -> p.getClass().getSimpleName().toUpperCase().equals(type.toUpperCase()))
				.toArray(Piece[]:: new);
		for(int i = 0; i < filteredPieceArr.length; i++) {
			total += filteredPieceArr[i].getSuperficie();
		}
			
		return total;
	}
	
	public int getNbPieceParType(String type) {	
		Piece[] filteredPieceArr = Arrays.stream(piecesMaison)
				.filter(p -> p.getClass().getSimpleName().toUpperCase().equals(type.toUpperCase()))
				.toArray(Piece[]:: new);		
		return filteredPieceArr.length;
	}
	

}
