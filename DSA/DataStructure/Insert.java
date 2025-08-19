
import java.util.Scanner;
class Node{
    int data;
    Node next;
    public  Node(int data){
        this.data=data;
    }
}
//At beginning of the list
class Single{
    Node head;
    public void insert(int data){
        Node a=new Node(data);
        if(head==null){
            head=a;
            return;
        }
        a.next=head;
        head=a;
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
}
//At end of the list
class Single1{
    Node head;
    public void insert(int data){
        Node a=new Node(data);
        if(head==null){
            head=a;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=current; 
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
}

public class Insert {

    public static void main(String[] args) {
        Single s=new Single();
        Single1 s1=new Single1();
        Scanner lee=new Scanner(System.in);
        System.out.println("Enter the number of elements to insert:");
        int n=lee.nextInt();
       
        for(int i=0;i<n;i++){
            //Scanner sc=new Scanner(System.in);
            System.out.println("Enter the data to insert:");
            int data=lee.nextInt();
            s.insert(data);
            s1.insert(data);

        }
        System.out.println("The linked list is:"); 
        s.display(); 
        s1.display();               
    }
}
