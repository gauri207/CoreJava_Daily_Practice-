package Strings;
//abstract method is method without method body
//it class is abstract 	---> not mandatory that method is Abstract()
//if method is abstract	---> class must be abstract
abstract class Vehicle{
	abstract void show();//abstract method
}
//abstract is a non-access modifier in java
//applicable for classes,
//methods but not variables.
class Car extends Vehicle{
	//it is mandatory to define abstract class method if we inherit abstract class
	//otherwise compiler will throw an error
	void show() {
		System.out.println("Car starts with key");
	}
}
public class AbstractClass extends Vehicle{
	void show() {
		System.out.println("Scooter starts with kick");
	}
	public static void main(String[] args) {
//		Vehicle vehicle=new Vehicle();
		Car car=new Car();
		car.show();
		
		AbstractClass abstractClass=new AbstractClass();
		abstractClass.show();
		
	}
}
/*
 * Abstraction is process of hiding implementation  details from user
 *  only shows required details
 */
