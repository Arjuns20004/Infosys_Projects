import java.util.Scanner;

public class ToggleBit {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int num = lee.nextInt();       
        int k = lee.nextInt();         

        int result = num ^ (1 << k);
        System.out.println("Result: " + result);
    }
}

