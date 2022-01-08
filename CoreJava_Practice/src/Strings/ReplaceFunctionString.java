package Strings;

public class ReplaceFunctionString {
	public static void main(String[] args) {
		String string="this is demo";
		System.out.println(string.replace("is", "was"));
		System.out.println(string.replaceFirst("is", "was"));
		System.out.println(string.replaceAll("is", "was"));
		System.out.println(string.replaceAll("is(.)","was"));
		System.out.println(string.replaceAll("is(.)","was"));
	}



}
