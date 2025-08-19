import java.util.Scanner;

public class Thirdlarge {
 public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter a Size:");
        int size=lee.nextInt();
        int Max1=Integer.MIN_VALUE;
        int Max2=Integer.MIN_VALUE;
        int Max3=Integer.MIN_VALUE;
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter a Numbers:");
            arr[i]=lee.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>Max1){
                Max3=Max2;
                Max2=Max1;
                Max1=arr[i];
            }
            else if(arr[i]>Max2 && arr[i]!=Max1){
                Max3=Max2;
                Max2=arr[i];
            }
            else if(arr[i]>Max3 && arr[i]!=Max1 && arr[i]!=Max2){
                Max3=arr[i];
            }

        }
        System.out.println(Max3);

    }

 }   
