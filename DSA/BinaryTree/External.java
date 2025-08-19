class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}

public class External {
    Node root;
    int count(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)
        { 
            return 1;
        }
        return count(root.left)+count(root.right);
    }
    public static void main(String[] args) {
        
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        External obj = new External();
        int count1 = obj.count(root);
        System.out.println("Count of nodes in the External Node: " + count1);
    
    }
}
