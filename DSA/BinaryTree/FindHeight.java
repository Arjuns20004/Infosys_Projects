class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}

public class FindHeight {
    Node root;
    int height(Node root){
        if(root==null)return 0;
        int left_right=height(root.left);
        int right_right=height(root.right);
        return 1 +Math.max(left_right,right_right);
    }
    public static void main(String[] args) {
        
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        //FindHeight obj = new FindHeight();
        //int count1 = obj.count(root);
        //System.out.println("Count of nodes in the External Node: " + count1);
    
    }
}
