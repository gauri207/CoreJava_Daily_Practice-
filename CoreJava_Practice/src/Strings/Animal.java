package Strings;

public class Animal {
	int no=12;
	String nameString="Bruno";
	public static void main(String[] args) {
		System.out.println("Demo on Class");
		Animal dogAnimal=new Animal();
//		dogAnimal.no;
		dogAnimal.run();
		System.out.println(dogAnimal.nameString);
	}
	public void run() {
		
		System.out.println("Dog is running");
	}

}
