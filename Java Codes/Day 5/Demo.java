import java.util.Scanner;
public class Demo {
    public void Print1(){
        System.out.println("Hi");
    }
}
class Demo1
 {
    public void Print2(){
        System.out.println("Hello");
    }
    public static void main(String args[]) {
        Scanner lee=new Scanner(System.in);
        Demo a=new Demo();
        a.Print1();
        Demo1 b=new Demo1();
        b.Print2();

        lee.close();
    }
    
}
