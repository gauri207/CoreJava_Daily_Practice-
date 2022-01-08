package Strings;
//can't override static,final,an private method in derived class
abstract class BaseClass{
	abstract void write();;
	void show() {
		System.out.println("base class");
	}
}
//interface --->we can't create the instance of interface like abstract class
interface Demo11{
	void display();
}
public class Override extends BaseClass implements Demo11{
	void write() {
		System.out.println("abstract class method is override");
	}
	public void display() {
		System.out.println("This is interface demo");
	}
	void show() {
		////for calling base class function first
		super.show();
		System.out.println("derived class");
	}
	public static void main(String[] args) {
		Override override=new Override();
		override.show();
		override.display();
		override.write();
		
	}

}
