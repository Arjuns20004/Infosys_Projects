// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Day {
    public static void main(String[] args) {
        Scanner val =new Scanner(System.in);
        System.out.println("Enter a date(1 to 7):");
        int date=val.nextInt();
        switch(date)
        {
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;
            
            case 3:
            System.out.println("wednesday");
            break;
            
            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
            System.out.println("Invalid Input");
        }
        
    }
}