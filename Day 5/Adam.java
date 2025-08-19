import java.util.Scanner;
public class Adam {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int b=lee.nextInt();
        int rev=0;
       // int temp==b;
        while (b>0) 
        {
            int dig=b%10;
            rev=rev*10+dig;
            b=b/10;
        }
        if(a==rev)
        {
            System.out.println("Adam");
        }
        else{
            System.out.println("Not");
        }
    }
    
}
