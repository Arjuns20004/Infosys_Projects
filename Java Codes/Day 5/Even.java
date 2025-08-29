import java.util.Scanner;
public class Even {

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void isCheck(boolean isEven)
    {
        if(isEven)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        isEven(a);
        isCheck(false);
     lee.close();   
    }
    
}
