class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Max {
    int depth(Node root){
        if(root == null) return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return Math.max(leftDepth,rightDepth) + 1;
    }
    public static void main(String[] args) {
        Max max = new Max();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Depth of the tree: " + max.depth(root));
    }
}