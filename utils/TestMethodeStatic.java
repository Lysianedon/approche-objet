package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		
//		Declare a variable of type String containing an integer and then use a method from the class Integer to convert the string into an integer.
		
		String strInteger = "42";
		int integer = Integer.parseInt(strInteger);	
//		Declare two integers a and b:
		int a = 43;
		int b = 89;
		
//		Use a method from the class Integer to calculate the biggest integer between a and b:
		System.out.println(Integer.max(a, b));
		
		
	}

}
