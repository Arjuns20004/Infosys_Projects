import java.util.*;

public class Array {
    public static void main(String args[]) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Enter a Size");
        int size = lee.nextInt();
        int ar[] = new int[size];

        for(int i = 0; i < ar.length; i++) {  
            System.out.print("Enter a value: ");
            ar[i] = lee.nextInt();
        }

        for(int i = 0; i < ar.length; i++) {  
            System.out.println("Index "+i+"-->"+ar[i] + " ");
        }
        System.out.println(Arrays.toString(ar));

        lee.close();  
    }
}
