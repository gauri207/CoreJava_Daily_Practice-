package Strings;

public class ConcatStrings {
	public static void main(String[] args) {
		String s1="gauri";
		String s2="kale";
		System.out.println(s1.concat(s2));
		System.out.println(s1 +" " + s2);
		System.out.println(10+20+s1);//30gauri
		System.out.println(10+s2+20);//10kale20
		System.out.println(s2+10);//kale10
		System.out.println(s2+20+10);//kale2010
		System.out.println(s1+20/10);//BODMAS RULE
//		System.out.println(s1+10-20);//error
	}
}
