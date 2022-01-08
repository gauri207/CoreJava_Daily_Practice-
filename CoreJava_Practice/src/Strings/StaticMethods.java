package Strings;
class Static1{
	static void hello() {
		System.out.println("hello guys");
	}
}
public class StaticMethods {
	void display() {
		System.out.println("simple methods");
	}
	static void staticM() {
		System.out.println("static methods");
	}
	public static void main(String[] args) {
		StaticMethods s=new StaticMethods();
		s.display();
		s.staticM();
		StaticMethods.staticM();
		Static1.hello();
	}
}
