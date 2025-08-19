
import java.util.Scanner;
class Demo2{
	static {
		System.out.println("Static Block From Demo2 class");
	}
	{
		System.out.println("Instance Block From Demo2 Class");
	}
}
class Demo{
	static {
		System.out.println("Static Block From Demo class");
	}
	{
		System.out.println("Instance Block From Demo class");
	}
	
}
public class Main {
	//Static Block --> while loading the class
	static {
		Demo2 demo2 = new Demo2();
		System.out.println("Static Block From Main Class");
	}
	//Instance Block -> while creating the Object
	{
		System.out.println("Instance Block From Main Class");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Demo demo = new Demo();
	}
}

