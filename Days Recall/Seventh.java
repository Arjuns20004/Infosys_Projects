import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
            Scanner lee=new Scanner(System.in);
            int a=lee.nextInt();
            int count=0;
            while(a!=1){
                if(a%2==0){
                    a=a/2;
                    count++;
                }
                else{
                    a=3*a+1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
