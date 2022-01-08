package Strings;

public class StringMethos {
	public static void main(String[] args) {
		String s=new String("    gauri    kale   ");
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println("length :-" + s.length());
		System.out.println("is empty :-" +s.isEmpty());
		System.out.println("check is Empty using equals() method ---->" +s.equals(""));
	}
}
