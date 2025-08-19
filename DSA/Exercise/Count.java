class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}

public class count {
    Node root;

    // Count and print external (leaf) nodes
    int printExternal(Node node) {
        if (node == null) return 1;
        if (node.left != null && node.right != null) {
            System.out.print(node.data + " ");
            return 1+printExternal(node.left) + printExternal(node.right);
        }
        return 0;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        count obj = new count();
        System.out.print("External (leaf) nodes: ");
        int extCount = obj.printExternal(root);
        System.out.println("\nCount of external nodes: " + extCount);
    }
}