import java.util.*; // filepath: d:\Placement Class\DSA\LeafNodesNormal.java

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Minusone {

    // Print only leaf nodes (normal recursive method)
    void printLeafNodes(Node node) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> dataList = new ArrayList<>();
        while (true) {
            int val = sc.nextInt();
            if (val == -1) break;
            dataList.add(val);
        }
        // Build tree manually for 7 nodes (complete binary tree)
        if (dataList.size() < 7) {
            System.out.println("Please enter at least 7 numbers before -1.");
            return;
        }
        Node root = new Node(dataList.get(0));
        root.left = new Node(dataList.get(1));
        root.right = new Node(dataList.get(2));
        root.left.left = new Node(dataList.get(3));
        root.left.right = new Node(dataList.get(4));
        root.right.left = new Node(dataList.get(5));
        root.right.right = new Node(dataList.get(6));
        // Input: 1 2 3 4 5 6 7 -1

        Minusone obj = new Minusone();
        obj.printLeafNodes(root); // Output: 4 5 6 7
    }
}