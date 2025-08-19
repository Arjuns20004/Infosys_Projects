import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int b=lee.nextInt();
        int count=0;
        int sum=0;
        int sum1=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)//&& i%2==0)
            {
                count++;
                //System.out.println(i);
                sum=sum+i;
            }
            System.err.println(sum);

        }
        for(int i=1;i<=b;i++)
        {
            if(b%i==0)//&& i%2==0)
            {
                count++;
                //System.out.println(i);
                sum1=sum1+i;
            }
            System.err.println(sum1);

        }
        if(sum==sum1){
            System.out.println("Ami");
        }
        else{
            System.out.println("Not");
        }
    }
}
