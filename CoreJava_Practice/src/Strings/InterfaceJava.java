package Strings;
//methods are---->public / abstract
//variables---> final/static/public
//even we can declare methods defualt and static also
//we cant write body of function inside interface but 
//we initialize variable inside body of intercase
interface I1{
	public static final int no = 10;
	public static final String string = "Gauri";
	public void show();
	default void display() {
		System.out.println("Default method in interface....");
	}
	static void happy() {
		System.out.println("Be happy always!!!!...static methods of interfaces");
	}
}
interface I2{
	void show1();
}
public class InterfaceJava implements I1,I2{
//	int no=10;
//	String string="Gauri";
	public void show1() {
		System.out.println("Interface 2");
	}
	public void show() {
		System.out.println("Method is override from interface");
		System.out.println(string);
		System.out.println(no);
		
	
	}
	
	public static void main(String[] args) {
		InterfaceJava interfaceJava=new InterfaceJava();
		interfaceJava.show();
		interfaceJava.display();
		I1.happy();//directly call through interface name
		interfaceJava.show1();
	}

}
