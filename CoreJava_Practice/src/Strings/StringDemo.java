package Strings;

public class StringDemo {
	public static void main(String args[]) {
		 String s1="gauri";
		 System.out.println(s1);
		 String s2="Gauri";
//		 System.out.println(s1==s2);
		 String s3= new String("gauri");
//		 System.out.println(s1==s3);
		 //equals() ---->checks the content of two strings
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.equalsIgnoreCase(s2));
		 System.out.println(s1.compareTo(s3));//0
		 System.out.println(s1.compareTo(s2));//32
		 System.out.println(s1.compareToIgnoreCase(s2));//0
	}
}
