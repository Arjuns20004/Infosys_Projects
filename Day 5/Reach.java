import java.util.Scanner;
public class Reach {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int steps=0;
        while (a!=1)
        {
            if(a%2==0)
            {
                a=a/2;
                
            } 
            else
            {
                a=3*a+1;
            }  
            steps++;
        }
        System.out.println(steps);
    }
    
}
