package Strings;
class SuperClass{
	SuperClass(){
		System.out.println("Parent Class");
	}
}
public class SuperConstructor extends SuperClass{
	SuperConstructor() {
		// TODO Auto-generated constructor stub
		System.out.println("Derived Class");
	}
	public static void main(String[] args) {
		SuperConstructor s=new SuperConstructor();
		//it will 1st call parent class and then derived class constructor
		}
}
