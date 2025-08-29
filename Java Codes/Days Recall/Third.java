import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int fact=1;
        for(int i=1;i<a;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
