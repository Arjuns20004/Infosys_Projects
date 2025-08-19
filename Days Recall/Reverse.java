import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
 public static void main(String[] args) {
    Scanner lee=new Scanner(System.in);
    System.out.println("Enter a Size of value:");
    int size=lee.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i]=lee.nextInt();

    }
    for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
    }
    int index=0;
    int newArray[]=new int[arr.length];
    for(int i=arr.length-1;i>=0;i--){
        newArray[index++]=arr[i];
    }
    System.out.println(Arrays.toString(newArray));
 }   
}
