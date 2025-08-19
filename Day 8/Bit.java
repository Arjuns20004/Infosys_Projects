
import java.util.Scanner;

public class Bit
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the Number : ");
	    int n = sc.nextInt();
	    System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ','0'));
	    System.out.print("Enter the Bit Position : ");
	    int bitPosition = sc.nextInt();
	    int mask = 1<<bitPosition;
	    int updatedValue = n | mask;
	    System.out.println(updatedValue);
	    System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ','0'));
	    System.out.println(String.format("%32s", Integer.toBinaryString(updatedValue)).replace(' ','0'));
	    System.out.println(n);
	    System.out.println(updatedValue);
	    
	    
	    
	    
	}
}