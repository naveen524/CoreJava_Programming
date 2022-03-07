package Strings;

public class Remove_Char_Print_Numeric_Val {
	static String print_Numeric(String str)
	{
		str=str.replaceAll("[^\\d]", " ");
		str=str.trim();
		str=str.replaceAll(" +", "");
		if(str.equals(""))
			return "-1";
		return str;
	}
	public static void main(String[] args) {
		String str="naveen1 naresh2 prince3";
	    System.out.println(print_Numeric(str));	
	}
}
