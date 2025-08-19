import java.util.Scanner;

public class Harshel {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int temp=a;
        int rev=0;
        while(a!=0) {
            int dig=a%10;
            rev=rev+dig;
            a=a/10;
        }
         if(temp%rev==0){
            System.out.println("Har");
         }
         else{
            System.out.println("not");
         }
    }
}
