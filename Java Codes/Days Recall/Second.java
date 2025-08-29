import java.util.Scanner;

public class Second {
    public static void main(String args[]){
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        //int rev=0;
        //int count=0;
        int sum=0;
        /*while(a>0){
            int dig=a%10;
            //rev=rev*10+dig;
            sum=sum+a;
            a=a/10;
            //sum=sum+a;
            count++;
            //sum=sum+a;
        }*/
        while (a>0) {
            //int dig=a%10;
            sum+=a%10;
            a=a/10;

        }
        System.out.println(sum);
       // System.out.println(count);
        //System.out.println(rev);
    }
}
