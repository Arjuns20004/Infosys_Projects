import java.util.Scanner;

public class methoddiff {
    public static void sumTwo(int c){
        System.out.println("--------------------------");
        System.out.println("Sum="+c);
    }

    public static void diffTwo(int d){
        System.out.println("--------------------------");
        System.out.println("Diff="+d);
    }

    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter an Number 1:");
        int a=lee.nextInt();
        System.out.println("Enter an Number 2:");
        int b=lee.nextInt();
        int c=a+b;
        int d=a-b;
        sumTwo(c);
        diffTwo(d);
        lee.close();
    }
}
