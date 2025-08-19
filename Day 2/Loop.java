import java.util.*;
public class Loop {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter an case \n For Loop for 1 \n While loop for 2 \n Do while for 3");
        int num=lee.nextInt();
        System.out.println("Enter an How many times to print");
        int val=lee.nextInt();
        int i=0;
        switch(num)
        {
            case 1:
            for(i=0;i<val;i++)
            {
                System.out.println("Hello world");
            }
            break;
            
            case 2:
            i=0;
            while(i<val)
            {
                System.out.println("Hello world");
                i++;
            }
            break;
            
            
            case 3:
            i=0;
            do
            {
                System.out.println("Hello world");
                i++;
            }while(i<val);
            break;
            
            default:
            System.out.println("Invalid");
        }
    }
}
