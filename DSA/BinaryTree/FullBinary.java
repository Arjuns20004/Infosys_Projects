class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}

public class FullBinary {
    Node root;
    boolean isFBT(Node node) {
        if (node == null) return true;
        if (node.left == null && node.right == null) return true;
        if (node.left != null && node.right != null) {
            return isFBT(node.left) && isFBT(node.right);
        }
        return false;
    }
    public static void main(String args[]) {
        FullBinary obj = new FullBinary();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);
        obj.root.right.left = new Node(6);
        obj.root.right.right = new Node(7);

        if(obj.isFBT(obj.root)){
            System.out.println("The tree is a Full Binary Tree.");
        }
        else{
            System.out.println("The tree is not a Full Binary Tree.");
        }

        boolean result = obj.isFBT(obj.root);
        System.out.println("Is the tree a Full Binary Tree? " + result);
    }
}
