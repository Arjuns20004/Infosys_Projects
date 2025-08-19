import java.util.*;

public class Factor {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = lee.nextInt();

        System.out.println("Factors of " + a + " are:");

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }

        lee.close(); // Always good to close the scanner
    }
}



