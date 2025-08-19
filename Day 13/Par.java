import java.util.*;
class GrandParent{
    String name;
    String gender;

    GrandParent(String name,String gender){
        this.name=name;
        this.gender=gender;
    }
     public void display(){
        System.out.println("GrandName: "+name);
        System.out.println("GrandGender: "+gender);
     }

}
class Parent extends GrandParent{
    String name0;
    String gender0;

    Parent(String name,String gender,String name0,String gender0){
        super(name, gender);
        this.name0=name0;
        this.gender0=gender0;
    }
    public void display1(){
        System.out.println("ParentName: "+name0);
        System.out.println("ParentGender: "+gender0);
    }
}

class Child extends Parent{
    String name1;
    String gender1;

    Child(String name,String gender,String name0,String gender0,String name1,String gender1){
        super(name, gender,name0,gender0);
        this.name1=name1;
        this.gender1=gender1;
    }
    public void display2(){
        System.out.println("ChildName: "+name1);
        System.out.println("ChildGender: "+gender1);
    }
}

public class Par {
    public static void main(String args[]){
        Scanner lee=new Scanner(System.in);
        String name=lee.nextLine(),gender=lee.nextLine(),name0=lee.nextLine(),gender0=lee.nextLine(),name1=lee.nextLine(),gender1=lee.nextLine();
        Child d3=new Child(name,gender,name0,gender0,name1,gender1);
        d3.display();
        d3.display1();
        d3.display2();

        lee.close();
    }    
}
