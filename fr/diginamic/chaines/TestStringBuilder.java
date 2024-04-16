package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder(1);
		String string = "";
		long debut = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) stringBuilder.append(i);
//		for(int i = 0; i < 100000; i++) string = string + i;

		long fin = System.currentTimeMillis();
		
		System.out.println(fin - debut);
	}

}
