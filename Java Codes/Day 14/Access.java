
import java.util.Scanner;

public class Access {
    public static void main(String args[]) {
        Scanner lee = new Scanner(System.in);

        // Example usage of Scanner
        System.out.println("Enter a value:");
        String input = lee.nextLine();
        System.out.println("You entered: " + input);

        // Close the Scanner to avoid resource leaks
        lee.close();

        Scanner le = new Scanner(System.in);

        // Example usage of Scanner
        System.out.println("Enter a value:");
        String input1 = le.nextLine();
        System.out.println("You entered: " + input);

        le.close();

        // 
    }
}