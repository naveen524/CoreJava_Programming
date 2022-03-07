package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Repeated_Num {
	public static void main(String[] args) {

		// create an arraylist from the array
		// using asList() method of the Arrays class
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
		System.out.println("ArrayList with duplicate elements: " + numbers);

		// convert the arraylist into a set
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.addAll(numbers);

		// delete al elements of arraylist
		numbers.clear();

		// add element from set to arraylist
		numbers.addAll(set);
		System.out.println("ArrayList without duplicate elements: " + numbers);
	}
}
