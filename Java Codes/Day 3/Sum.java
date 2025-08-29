import java.util.*;

public class Sum {
    public static void main(String args[])
    {
        Scanner lee=new Scanner(System.in);
        int num=lee.nextInt();
        int product=1;
        for(int i=1;i<=num;i++)
        {
            product=product*i;
        }
        System.out.println(product);
        lee.close();
    }    
}
