import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter a Size of a values to be Stores:");
        int size=lee.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter a values:"+i+" :");
            arr[i]=lee.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
