package Strings;
class Company{
	static String companyName="Amazon";
	int no;
	String name;
	Company(int no,String name) {
		// TODO Auto-generated constructor stub
		this.no=no;
		this.name=name;
	}
	void display() {
		System.out.println("Cpmapny Name:"+companyName);
		System.out.println("No is:"+no);
		System.out.println("Name is:"+name);
	}
}
public class StaticKeyword {
	public static void main(String[] args) {
		Company c=new Company(11, "gauri");
		c.display();
		System.out.println();
		Company c1=new Company(12, "amol");
		c1.display();
		System.out.println();
		System.out.println(Company.companyName);
//		System.out.println(Company.display());
	}
}
