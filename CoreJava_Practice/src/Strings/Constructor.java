package Strings;

public class Constructor {
	String name;
	Constructor(String name) {
		super();
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	void display() {
		System.out.println("name is:"+name);
	}
	public static void main(String[] args) {
		Constructor csConstructor=new Constructor("gauri");
		System.out.println(csConstructor.name);
		csConstructor.display();
		}

}
