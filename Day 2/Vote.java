import java.util.Scanner;
class Vote {
    public static void main(String[] args) {
        Scanner val =new Scanner(System.in);
        System.out.println("Enter a age:");
        int age=val.nextInt();
        boolean aadhar=true;
        if(age>18)
        {
          if(aadhar==true)
          {
              System.out.println("vote");
          }
        }
        else{
        System.out.println("Not");
        }
    }
}