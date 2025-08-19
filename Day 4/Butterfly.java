import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter a Number of rows:");
        int n=lee.nextInt();
        /*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
            */

    
            // Upper Half
            for (int i = 1; i <= n; i++) {
                // Left stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
    
                // Spaces
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print(" ");
                }
    
                // Right stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
    
                System.out.println();
            }
    
            // Lower Half
            for (int i = n; i >= 1; i--) {
                // Left stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
    
                // Spaces
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print(" ");
                }
    
                // Right stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
    
                System.out.println();
            }
            
        lee.close();
    }
}
