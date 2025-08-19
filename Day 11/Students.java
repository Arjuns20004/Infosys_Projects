import java.util.*;
class Students{
    String name;
    int roll;
    int m1,m2,m3;
    
    public void setDetails(String name,int roll,int m1,int m2,int m3){
        this.name=name;
        this.roll=roll;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    
    public void calculateGrade(){
        int total=m1+m2+m3;
        double  avg=total/3.0;
        String grade;
        if(avg>=90) grade="A";
        else if(avg>=75) grade="B";
        else if(avg>=50) grade="C";
        else grade="D";

        System.out.println("Name: " + name + ", Roll No: " + roll + ", Grade: " + grade);
    }
    
    public void display(){}
    
    public static void main(String args[]){
        Scanner lee=new Scanner(System.in);
        String name=lee.nextLine();
        int roll=lee.nextInt();
        int m1=lee.nextInt(),m2=lee.nextInt(),m3=lee.nextInt();
        
        Students det=new Students();
        det.setDetails(name,roll,m1,m2,m3);
        det.calculateGrade();
        det.display();
    }
}