import java.util.Scanner;

public class methodarith {
    public static void sumTwo(int c){
        System.out.println("--------------------------");
        System.out.println("Sum="+c);
    }

    public static void diffTwo(int d){
        System.out.println("--------------------------");
        System.out.println("Diff="+d);
    }

    public static void mulTwo(int e){
        System.out.println("--------------------------");
        System.out.println("Mul="+e);
    }


    public static void divTwo(int f){
        System.out.println("--------------------------");
        System.out.println("Div="+f);
    }

    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter an Number 1:");
        int a=lee.nextInt();
        System.out.println("Enter an Number 2:");
        int b=lee.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        sumTwo(c);
        diffTwo(d);
        mulTwo(e);
        divTwo(f);
        lee.close();
    }
}
