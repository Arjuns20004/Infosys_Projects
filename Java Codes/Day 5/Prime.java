import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int a) {
        if (a <= 1) return false;

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int a) {
        int temp = a;
        int rev = 0;

        while (a != 0) {
            int dig = a % 10;
            rev = rev * 10 + dig;
            a = a / 10;
        }

        return rev == temp;
    }

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = lee.nextInt();

        if (isPrime(a)) {
            System.out.println(a + " is a Prime number");
        } else {
            System.out.println(a + " is NOT a Prime number");
        }

        if (isPalindrome(a)) {
            System.out.println(a + " is a Palindrome number");
        } else {
            System.out.println(a + " is NOT a Palindrome number");
        }

        if (isPrime(a) && isPalindrome(a)) {
            System.out.println(a + " is a Prime Palindrome number!");
        }
    }
}
