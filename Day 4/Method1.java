import java.util.Scanner;

public class Method1 {
    public static void sumTwo(){
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter an Number 1:");
        int a=lee.nextInt();
        System.out.println("Enter an Number 2:");
        int b=lee.nextInt();
        int c=a+b;
        System.out.print(c);
    }

    public static void main(String[] args) {
        sumTwo();
    }
}
