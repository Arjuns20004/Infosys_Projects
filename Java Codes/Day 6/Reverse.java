import java.util.Scanner;
class Reverse {
	
	//creating Array
	public static int [] createArray(int size) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int[size];
		System.out.print("Enter the Elements : ");
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	//print the Array
	public static void printArray(int[] ar) {
		System.out.print("Array Elements are : ");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+ "  ");
		}
	}
	//Print Array in Reverse Order
	public static void printArrayReverse(int [] ar) {
		System.out.print("Array Elements are : ");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.print(ar[i]+ "  ");
		}
	}
	
	public static int [] reverseArray(int [] oldArray) {
		int index = 0;
		int [] newArray = new int[oldArray.length];
		
		for(int i=oldArray.length-1; i>=0; i--) {
			newArray[index++] = oldArray[i];
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array : ");
		int size = sc.nextInt();
		int[] ar = createArray(size);
		int [] newArray = reverseArray(ar);
		printArray(newArray);
		
	}
}
