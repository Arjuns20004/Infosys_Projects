import java.util.*;

class Node{
    int data;
    Node right , left;
    Node (int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}
public class Insert
{
    static Node root;
    void Binary(int data){
        root = new Node(data);
    }
    void Insertright(Node root,int data){
        root.right = new Node(data);
    }

    void Insertleft(Node root,int data){
        root.left = new Node(data);
    }
	public static void main(String[] args) {
		Insert obj = new Insert();

        obj.Binary(10);
		obj.Insertleft(root,20);
        obj.Insertright(root,30); 
        obj.Insertleft(root.left,40);      
	}
    
}
