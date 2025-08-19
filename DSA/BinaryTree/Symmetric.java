class Node{
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}
public class Symmetric {
    Node root;
    boolean isSymmetric(Node left, Node right) {
    
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.data == right.data) && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
    boolean isSymmetric() {
        return isSymmetric(root.left, root.right);
    }
    public static void main(String[] args) {
        Symmetric tree = new Symmetric();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);

        if (tree.isSymmetric()) {
            System.out.println("The tree is symmetric.");
        } else {
            System.out.println("The tree is not symmetric.");
        }
    }
}
