import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt(),b=lee.nextInt();
        int arr[][] =new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=lee.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==0||j==0||i==a-1||i==b-1){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
