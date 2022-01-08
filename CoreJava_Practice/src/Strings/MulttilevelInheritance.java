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
public class MulttilevelInheritance extends B{
	void showC() {
		System.out.println("C class");
	}
	public static void main(String[] args) {
		MulttilevelInheritance inheritance=new MulttilevelInheritance();
		inheritance.showA();
		inheritance.showB();
		inheritance.showC();
		System.out.println();
		
		A a=new A();
		a.showA();
		System.out.println();
		
		B b=new B();
		b.showA();
		b.showB();
		
		
		
		
	}

}
