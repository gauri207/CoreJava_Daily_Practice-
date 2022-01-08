package Strings;

public class ThisKeyword {
	int no;//instance variables are for objects
	void get(int no) {
		this.no = no;
		//this is reference variable that points to current obj
	}
	public void set() {
		System.out.println(no);
	}
	public static void main(String[] args) {
		ThisKeyword thisKeyword=new ThisKeyword();
		thisKeyword.get(10);
		thisKeyword.set();
	}

}
