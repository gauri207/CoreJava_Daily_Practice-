package Strings;
class Student{
	final int phone_No=10;
	final void show() {
		System.out.println("Phone No is:"+phone_No);
	}
}//final class cant be override
public class FinalKeyword {
//	void show() {
//		System.out.println("Dervied");
//	}//error cant override final method
	void diaplay() {
		System.out.println("hello gauri");
	}
	public static void main(String[] args) {
		FinalKeyword o=new FinalKeyword();
//		System.out.println(o.phone_No=20);
//		o.show();//error
		o.diaplay();
	}
}
