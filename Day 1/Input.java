import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in); 

        System.out.println("Enter 1:");
        int a = num1.nextInt();  

        System.out.println("Enter 2:");
        int b = num1.nextInt();

        System.out.print("Value 1: " + a);  
        System.out.print("Value 2: " + b);
    }
}
