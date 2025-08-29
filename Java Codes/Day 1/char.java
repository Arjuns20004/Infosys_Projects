
import java.util.Scanner;

class Char {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.print("Enter a Name: ");
        char b=lee.nextLine().charAt(0);
        System.out.println("You entered: " + b);
        System.out.print("Enter a Name: ");
        String c=lee.nextLine();
        System.out.println("You entered: " + c);
        
        lee.close();  // Always good to close the scanner
    }
}
