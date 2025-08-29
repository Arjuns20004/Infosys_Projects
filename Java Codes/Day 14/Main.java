
public class Main  {
	public void add() {
		int a = 10;
		int b = 10;
		System.out.println(a+b);
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void add(int a, float b) {
		System.out.println(a+b);
	}
	
	public void add(float a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {	
		Main m = new Main();
		m.add(3,'A');
		
	}
}