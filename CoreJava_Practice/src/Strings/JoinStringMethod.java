package Strings;

public class JoinStringMethod {
	public static void main(String[] args) {
		String S1="gauri";
		String S2="kale";
		String s3="Engineer";
		//here is ; is delimeter is passed between no of  strings
		//join() is the static methods since we directly calls through String class
		System.out.println(String.join(";",S1,S2,s3));
		String msgString = String.join("-", "Java","is","cool");
		System.out.println("Join function is - "+ msgString);
	}

}
