import java.util.*;
import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;

        // num ku ella chinna divisors ah check pannrom
        for (int i = 1; i < num; i++) {
            if (num % i == 0) { // i is a divisor
                sum = sum + i; // sum of divisors
            }
        }

        // Check if sum == num
        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }

        input.close();
    }
}
