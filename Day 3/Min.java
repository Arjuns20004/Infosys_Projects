import java.util.Scanner;

public class Min {
    public static void main(String args[])
    {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int min=10;
        while (a!=0)
        {
            int c=a%10;
            if(c<min){
                min=c;
            }
            a/=10;

        }
        System.out.println(min);

        lee.close();
    
    }    
}
