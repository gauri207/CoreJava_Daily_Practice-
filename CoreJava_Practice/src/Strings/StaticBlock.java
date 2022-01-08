package Strings;

public class StaticBlock {
	static int i=10;
	static {
		System.out.println("Static Block calls first");
	}
	public static void main(String[] args) {
		System.out.println(StaticBlock.i);
	}
}
