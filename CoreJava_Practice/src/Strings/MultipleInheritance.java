package Strings;

//private methods are not accessible outside the class
class InClass{
	private
	void show() {
		System.out.println("A class");
	}
}
//class B{
//	void show() {
//		System.out.println("A class");
//	}
//}
public class MultipleInheritance extends InClass{
	public static void main(String[] args) {
		MultipleInheritance aInheritance=new MultipleInheritance();
		aInheritance.show();
	}

}
