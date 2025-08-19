import java.util.Scanner;

public class Onestar {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.println("Enter a Pattern Number:\n 1 for Right Triangle \n 2 for Full Stars");
        int a = lee.nextInt();

        System.out.println("Enter a number:");
        int num = lee.nextInt();

        switch(a) {
            case 1:
                // Right Triangle Pattern
                for(int i = 1; i <= num; i++) {
                    for(int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Full Stars Pattern (Square)
                for(int i = 1; i <= num; i++) {
                    for(int j = 1; j <= num; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        lee.close();
    }
}
