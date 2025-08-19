import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter a Product Number:");
        int num=lee.nextInt();
        int Product=1;
            for(int i=1;i<=num;i++)
            {
                Product=Product*i;
        }
        System.out.println(Product);
    }
}
