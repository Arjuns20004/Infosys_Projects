import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter a value1:");
        int a=lee.nextInt();
        System.out.println("Enter a Value2:");
        int b=lee.nextInt();
        int sum=0;
        int sum2=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                //System.out.print(i+' ');
                sum=sum+i;
            }
        }
        System.out.println("sum1="+sum);
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                //System.out.print(i+' ');
                sum2=sum2+i;
            }
        }
        System.out.println("sum2="+sum2);
        if(sum==b && a==sum2)
        {
            System.out.println(a+" and "+b+" Amicable");
        }
        else{
            System.out.println(a+" and "+b+" Not Amicable");
        }

        lee.close();
    }
}
