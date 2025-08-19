import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null; 
        this.right=null;
    }
}
public class Demo1 {
    //Node root;
    int preorder(Node node){
        if(node == null) return 0;
        System.out.print(node.data + " ");
        int lc = preorder(node.left);
        int rc = preorder(node.right);
        return 1+lc+rc; 
    }

    int inorder(Node node){
        if(node==null) return 0;
        int lc1=inorder(node.left);
        System.out.print(node.data+ " ");
        int rc2=inorder(node.right);
        return 1+lc1+rc2;   
    }
    int postorder(Node node){
        if(node==null) return 0;
        int lc2=postorder(node.left);
        int rc2=postorder(node.right);
        System.out.print(node.data+ " ");
        return 1+lc2+rc2;
    }
    void levelOrder(Node node) {
        if (node == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Demo1 tree = new Demo1();
        System.out.println("Preorder traversal:");
        tree.preorder(root);
        System.out.println("\nInorder traversal:");
        tree.inorder(root);
        System.out.println("\nPostorder traversal:");
        tree.postorder(root);
        System.out.println("\nLevel order traversal:");
        tree.levelOrder(root);
    }
}
 