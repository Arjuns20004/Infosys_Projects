import java.util.*;
class Demo1{
    int a,b;

    Demo1(int a,int b){
        this.a=a;
        this.b=b;
    }
     public void display(){
        System.out.println("Sum of Two num: "+(a+b));
     }

}
class Demo2 extends Demo1{
    int c;
    Demo2(int a,int b,int c){
        super(a, b);
        this.c=c;
    }
    public void display(){
        System.out.println("Sum of Three num: "+(a+b+c));
    }
}

class Demo3 extends Demo2{
    int d;
    Demo3(int a,int b,int c,int d){
        super(a,b,c);
        this.d=d;
    }
    public void display(){
        System.out.println("Sum of Four num: "+(a+b+c+d));
    }
}

public class Sum {
    public static void main(String args[]){
        Scanner lee=new Scanner(System.in);
        int a=lee.nextInt();
        int b=lee.nextInt();
        int c=lee.nextInt();
        int d=lee.nextInt();
        Demo1 d1=new Demo1(a,b);
        Demo2 d2=new Demo2(a, b, c);
        Demo3 d3=new Demo3(a,b,c,d);
        d3.display();
        d2.display();
        d1.display();

        lee.close();
    }    
}
