
import java.util.*;
public class Rev {
    public static void main(String args[])
    {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter an number:");
        int n=lee.nextInt();
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);

        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }


        lee.close();
    }
}
