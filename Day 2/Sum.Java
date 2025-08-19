import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int num=lee.nextInt();
        int sum=0;
            for(int i=1;i<=num;i++)
            {
                sum=sum+i;
        }
        System.out.println(sum);
    }
}
