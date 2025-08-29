
public class Main
{
	public static void main(String[] args) {
	    
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println(String.format("%32s", Integer.toBinaryString(Integer.MIN_VALUE>>>1)).replace(' ', '0'));
		
	}
}