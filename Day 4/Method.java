import java.util.Scanner;

public class Method {
    public static void sumTwo(int c){
        System.out.print(c);
    }

    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter an Number 1:");
        int a=lee.nextInt();
        System.out.println("Enter an Number 2:");
        int b=lee.nextInt();
        int c=a+b;
        sumTwo(c);
        lee.close();
    }
}
