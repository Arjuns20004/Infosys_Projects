import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        {
            Scanner lee=new Scanner(System.in);
            int a=lee.nextInt();
            for(int i=1;i<=a;i++)
            {
                for(int j=1;j<=a;j++)
                {
                    if(i==1 || i==a ||j==1 || j==a)
                    {
                        System.out.print("1");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            System.out.println();
            }
            lee.close();
        }
    }
}
