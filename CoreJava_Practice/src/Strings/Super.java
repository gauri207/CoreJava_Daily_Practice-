package Strings;
class AClass{
	int a=10;
	void show() {
		
		System.out.println("Super class");
	}
	void display() {
		System.out.println("i am in super class");
	}
}
public class Super extends AClass{
	int a=20;
	void display() {
		System.out.println("i am in child class");
	}
	void show() {
		System.out.println("Child class");
		System.out.println("this keyword is reference variable that points to the current class instance variable:"+this.a);
		System.out.println("Super is used to points the instance variable immediate parent class:"+super.a);
		super.show();
		super.display();
		
	}
	public static void main(String[] args) {
		Super super1=new Super();
		super1.show();
	}
	

}
