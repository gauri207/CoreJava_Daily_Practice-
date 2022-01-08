package Strings;
class A{
	void showA() {
		System.out.println("A class");
	}
}
class B extends A{
	void showB() {
		System.out.println("B class");
	}
}
public class Hirar extends A{
public static void main(String[] args) {
	A a=new A();
	a.showA();
	System.out.println();
	
	B b=new B();
	b.showA();
	b.showB();
	System.out.println();
	
	Hirar hirar=new Hirar();
	hirar.showA();
	
}
}
