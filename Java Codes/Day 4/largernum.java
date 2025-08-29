import java.util.*;
public class largernum {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int max=0;
        int min=100;
        while(a>0) {
            int dig=a%10;
            if(dig>max)
            {
                max=dig;
            }
            if(dig<min)
            {
                min=dig;
            }   
            a=a/10;
        }
        System.out.println("Max="+max);
        System.out.println("Min="+min);
    }
}
