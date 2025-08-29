import java.util.*;
public class Left {
    public static void main(String args[]){
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int arr[]=new int[a];
        int First;
        for(int i=0;i<arr.length;i++){
            arr[i]=lee.nextInt();
        }
        First=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=First;
        System.out.println(Arrays.toString(arr));
    }   
}
