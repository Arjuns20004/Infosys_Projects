import java.util.Scanner;

class Node {
    int value;
    Node left, right;
    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class Create {
    Node root;
    public static void main(String args[]) {
        Create obj = new Create();
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

        System.out.println("Binary Tree Created:");
        System.out.println("Root value: " + obj.root.value);
        System.out.println("Left child value: " + obj.root.left.value);
        System.out.println("Right child value: " + obj.root.right.value);
        lee.close();
    }
}