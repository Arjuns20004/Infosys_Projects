import java.util.Scanner;
public class ArrayMax {
    public static void main(String args[]){
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=lee.nextInt();
        int arr[]=new int[a];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter a numbers:");
            arr[i]=lee.nextInt();
        }
        //int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        lee.close();
    }
    
}
