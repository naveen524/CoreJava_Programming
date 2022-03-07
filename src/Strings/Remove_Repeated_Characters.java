package Strings;

import java.util.LinkedHashSet;

public class Remove_Repeated_Characters {
	static void remove_Repeated_Char(String str)
	{
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
			set.add(str.charAt(i));
		for (Character ch : set) {
			System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		String str="naveenmanneela";
		remove_Repeated_Char(str);

	}
}
