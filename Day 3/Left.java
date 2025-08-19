import java.util.*;
class Left{
    public static void main(String[] args){
        Scanner st=new Scanner(System.in);
        int a=st.nextInt();
        for (int i=1;i<=a;i++){
            for(int j=i;j<a;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}