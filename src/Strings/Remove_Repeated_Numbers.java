package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Repeated_Numbers {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,6,7,8));
		System.out.println("Arrays With Duplicates :"+" "+al);
		HashSet<Integer> set= new HashSet<Integer>();
		set.addAll(al);
		al.clear();
		al.addAll(set);
		System.out.println("After Removing Duplicates :"+" "+al);
	}
}
