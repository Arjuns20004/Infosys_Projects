import java.util.Scanner;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int a = x ^ y; // XOR to find differing bits
        int count = 0;

        while (a != 0) {
            count += a & 1; // Check if the last bit is 1
            a >>= 1;        // Right shift to check the next bit
        }

        return count; 
    }

    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int x = lee.nextInt();
        int y = lee.nextInt();
        System.out.println("Hamming Distance: " + hammingDistance(x, y));
    }
}
