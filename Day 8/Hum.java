import java.util.*;
public class Hum{
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a = lee.nextInt();
        int b = lee.nextInt();
        int dis=0;
        while(a!=0 || b!=0){
            if((a&1) !=(b&1)){
                dis++;
            }
            a=a>>1;
            b=b>>1;
        }
        System.out.println("Hamming Distance: " + dis);
    }
}
