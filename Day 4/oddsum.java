import java.util.*;;
public class oddsum {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);

        lee.close();
    }
}
