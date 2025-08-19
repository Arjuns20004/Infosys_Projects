import java.util.Scanner;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Traverse {
    Node root;

    void Inorder(Node node) {
        if (node == null) return;
        Inorder(node.left);
        System.out.print(node.data + " ");
        Inorder(node.right);
    }
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String args[]) {
        Traverse obj = new Traverse();
        Scanner lee = new Scanner(System.in);

        System.out.print("Enter root value: ");
        int rootValue = lee.nextInt();
        obj.root = new Node(rootValue);

        System.out.print("Enter left child value: ");
        int leftValue = lee.nextInt();
        obj.root.left = new Node(leftValue);

        System.out.print("Enter right child value: ");
        int rightValue = lee.nextInt();
        obj.root.right = new Node(rightValue);

        System.out.print("Enter Left Left child value: ");
        int leftleft=lee.nextInt();
        obj.root.left.left=new Node(leftleft);

        System.out.print("Enter Left Right child value: ");
        int leftright=lee.nextInt();
        obj.root.left.right=new Node(leftright);

         System.out.print("Enter Right Left child value: ");
        int rightleft=lee.nextInt();
        obj.root.right.left=new Node(rightleft);

        System.out.print("Enter Right Right child value: ");
        int rightright=lee.nextInt();
        obj.root.right.right=new Node(rightright);



    
        System.out.println("Binary Tree Created:");
        System.out.println("Root value: " + obj.root.data);
        System.out.println("Left child value: " + obj.root.left.data);
        System.out.println("Right child value: " + obj.root.right.data);

        System.out.println("Inorder Traversal:");
        obj.Inorder(obj.root);

        System.out.println("\nPreorder Traversal:");
        obj.preorder(obj.root);

        System.out.println("\nPostorder Traversal:");
        obj.postorder(obj.root);

        lee.close();
    }
}