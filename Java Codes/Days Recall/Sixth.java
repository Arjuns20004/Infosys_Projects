import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int temp=a;
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0){
                sum=sum+i;
            }
        }
        if(sum==temp){
            System.out.println("Perfect");
        }
        else{
            System.out.println("Not");
        }
    }
}
