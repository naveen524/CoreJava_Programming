package Strings;

public class Remove_Spaces_From_String {
	public static void main(String[] args) {
		String str="naveen manneela";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
	}
}
