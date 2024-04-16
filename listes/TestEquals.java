package listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville v1 = new Ville("City", 100);
		Ville v2 = new Ville("City", 100);
		
		System.out.println(v1.equals(v2)); // Should return true
		System.out.println(v1 == v2); // Should return false

	}

}
