package Strings;

public class SubSequenceMethods {
	public static void main(String[] args) {
		String string="this is demo";
		System.out.println((string.subSequence(0,4)).getClass().getSimpleName());
//		System.out.println(typeOf(string));
		System.out.println(string.substring(4));
		System.out.println(string.substring(0, 6));
		Integer a=20;
		System.out.println(a.getClass().getSimpleName());
		
		
	}
}
