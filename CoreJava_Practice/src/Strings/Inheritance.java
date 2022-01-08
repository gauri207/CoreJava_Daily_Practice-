package Strings;
class Dog {
	String nameString="gauri kale";
	void eat() {
		System.out.println("Animal eats");
	}
	
}
public class Inheritance extends Dog {
	void runs() {
		System.out.println("Dogs runs very fast");
	}
	public static void main(String[] args) {
		Inheritance inheritance=new Inheritance();
		inheritance.runs();
		Dog dog=new Dog();
		
		dog.eat();
		System.out.println("name is:"+ dog.nameString);
	}
}
