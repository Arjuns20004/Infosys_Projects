import java.util.Scanner;

public class Gcd{
    // Recursive function to find GCD
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);  // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }
}
