
import java.util.Scanner;
public class Hallow {
    public static void main(String[] args) {
        {
            Scanner lee=new Scanner(System.in);
            int a=lee.nextInt();
            for(int i=0;i<a;i++)
            {
                for(int j=i;j<a-1;j++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++)
                {
                    System.out.print((char)('A'+j));
                }
                for(int j=i-1;j>=0;j--)
                {
                    System.out.print((char)('A'+j));
                }
                System.out.println();
            }



            lee.close();
        }
    }
}
