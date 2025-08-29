import java.util.*;
class First{
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter a size:");
        int size=lee.nextInt();
        int arr[]=new int[size] ;      //{23,1,12,14,45};
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter a Number:");
            arr[i]=lee.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            
        }
        System.out.println("Before Sort:");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(arr));
        System.out.println("The second largest number:"+arr[arr.length-2]);
        }
}