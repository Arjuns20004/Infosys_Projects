import java.util.*;
class Demo{
	//Static Variable
	static int a;
	//Non Static variable
	int b;
	public Demo(int a, int b) {
		this.a = this.a + a ;
		this.b = this.b + b;
	}
}
public class As {
	public static void main(String[] args) {
		Demo d1 = new Demo(10,10);
		System.out.println("Static A : "+d1.a);
		System.out.println("Non Static variable B: "+d1.b);
		Demo d2 = new Demo(10,10);
		System.out.println("Static A : "+d2.a);
		System.out.println("Non Static variable B: "+d1.b);
		Demo d3 = new Demo(10,10);
		System.out.println("Static A : "+d3.a);	
		System.out.println("Non Static variable B: "+d3.b);
	}
}