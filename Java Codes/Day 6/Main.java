
import java.util.Scanner;

class Main {
	public static int thirdLargest(int[] ar) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max1) {
				max3 = max2;
				max2 = max1;
				max1 = ar[i];
			}
			else if(ar[i]>max2 && ar[i] != max1) {
				max3 = max2;
				max2 = ar[i];
			}
			else if(ar[i]>max3 && ar[i] != max2 && ar[i] != max1) {
				max3 = ar[i];
			}
			
		}
		return max3;
	}
	
	public static int thirdSmallest(int[] ar) {
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int min3 = Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<min1) {
				min3 = min2;
				min2 = min1;
				min1 = ar[i];
			}
			else if(ar[i]<min2 && ar[i] != min1) {
				min3 = min2;
				min2 = ar[i];
			}
			else if(ar[i]<min3 && ar[i] != min2 && ar[i] != min1) {
				min3 = ar[i];
			}
			
		}
		return min3;
	}
	
	
	
	
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = sc.nextInt();
		int [] ar = createArray(size);
		printArray(ar);
		System.out.println();
		System.out.println("Third Largest : "+thirdLargest(ar));
		System.out.println("Third Smallest : "+thirdSmallest(ar));







	}
}