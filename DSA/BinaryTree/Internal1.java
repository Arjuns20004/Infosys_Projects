class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}

public class Internal1 {
    Node root;
    int count(Node node){
        if((node==null) || (node.left==null) && (node.right==null)) return 0;
        //if(root.left==null && root.right==null) return 0;
        return 1+count(node.left)+count(node.right);
    }
    public static void main(String[] args) {
        
        Internal1 obj = new Internal1();

        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
       // root.left.left = new Node(4);
        //root.left.right = new Node(5);

        int count1 = obj.count(obj.root);
        System.out.println("Count of nodes in the binary tree: " + count1);
    
    }
}
