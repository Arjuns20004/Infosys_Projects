import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
    Scanner lee=new Scanner(System.in);
    int a=lee.nextInt();
    for(int i=1;i<=a;i++)
    {
        for(int j=i;j<a;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print(k);
        }
        for(int l=i-1;l>0;l--)
        {
            System.out.print(l);
        }
        System.out.println();
    }   
}
}
