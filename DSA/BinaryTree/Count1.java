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

public class Count1
{
	Node root;
	int count(Node node){
	        if(node == null) return 0;
	        
	        return 1+count(node.left)+count(node.right);
	    }
	public static void main(String[] args) {
	    Count1 obj =  new Count1();
	    
		obj.root = new Node(1);
		obj.root.left =  new Node(2);
		obj.root.right =  new Node(3);
		obj.root.left.left =  new Node(4);
		obj.root.left.right =  new Node(2);
		
		System.out.println("Count : "+ obj.count(obj.root));
	}
	
}