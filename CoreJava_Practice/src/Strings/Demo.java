package Strings;

public class Demo {
	public static void main(String[] args) {
		String s1="gauri kale";
		String s2="kale";
		
		//type casting
		int a=10;
		System.out.println(String.valueOf(a));
		char[] ch = s2.toCharArray();
		System.out.println(ch);
		
		//case conversion
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//Searching char in string
		//chartAt(),contains(),lastIndexOf(),indexOf(),startsWith(),endsWith()
//		System.out.println(s1.endsWith("e"));
		
		
		//replaceFirst() ,replace(),replaceAll()
//		System.out.println(s1.replaceFirst("a", "eu"));
//		System.out.println(s1.subSequence(0, 3));
		
//		System.out.println(s1.concat(s2));
//		String s= new String().join("_","gauri","kale","gk");
//		System.out.println(s);
		
//method for storing password
		
//		String string=new String("  gauri kale  ");
//		String string2="gauri";
//		String string3=new String("Gauri");
//		System.out.println(string2.equalsIgnoreCase(string3));
//		Character []ch= {'g','a','u','r','i'};
//		System.out.println(string);
//		System.out.println(ch);
//		System.out.println(string.toUpperCase());
//		System.out.println(string.trim());
//		System.out.println(string.length());
	}
}
