import java.util.HashSet;
import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int s1=lee.nextInt();
        int[] arr1=new int[s1];
        for(int i=0;i<s1;i++)
        {
            arr1[i]=lee.nextInt();
        }
        int s2=lee.nextInt();
        int[] arr2=new int[s2];
        for(int i=0;i<s2;i++){
            arr2[i]=lee.nextInt();
        }

        HashSet<Integer> first=new HashSet<>();
        for(int num1:arr1){
            first.add(num1);
        }

        HashSet<Integer> Second=new HashSet<>();
        for(int num2:arr2){
            if(first.contains(num2)){
                Second.add(num2);
            }
        }

        System.out.println(Second);

    }
}
