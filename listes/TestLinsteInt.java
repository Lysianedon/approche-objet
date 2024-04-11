package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestLinsteInt {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(-1);
		array.add(5);
		array.add(7);
		array.add(3);
		array.add(-2);
		array.add(4);
		array.add(8);
		array.add(-16);
		array.add(5);
		array.add(-17);
		
//		Display the arrayList:
		System.out.println(array);
		
//		Display the arrayList's size
		System.out.println("Array's size: " + array.size());
		
//		Get the biggest and the smallest integer:
		int maxNb = array.get(0);
		int minNb = array.get(0);
		
		for(int i : array) {
			maxNb = i > maxNb ? i : maxNb;
			minNb = i < minNb ? i : minNb;
		}
		System.out.println("The biggest integer is: " + maxNb);
		System.out.println("The smallest integer is: " + minNb);
		
//		Remove the smallest integer:		
		Iterator<Integer> numbers = array.iterator();
		while(numbers.hasNext()) {
			int n = numbers.next();
			if(n == minNb) numbers.remove();
		}
				
		System.out.println("array after removing the smallest int: " + array);
		
//		Look for every negative values and turn them into positive values:
		for(int i = 0; i < array.size(); i++) {
			int n = array.get(i);
			if(n < 0) array.set(i, n - ( n * 2));
		}
//		Display the final result:
		System.out.println("Final array: " + array);
		
		
//		Hack: 2nd way to get biggest integer : 
//		Collections.sort(array);
//		System.out.println(array.get(array.size() - 1));
		
//		Hack: 2nd way to get and remove the smallest integer : 
//		Collections.sort(array);
//		System.out.println(array.remove(0));
	}
}


