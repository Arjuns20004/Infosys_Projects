import java.util.*;

class Nary{
    public static class Node{
        int data;
        List <Node> children;
        public Node(int data){
            this.data = data;
            this.children = new ArrayList<>();
        }
        
        public void addchild(Node child){
            this.children.add(child);
        }
    }
    
    public static void main(String[] args) {
		Node root = new Node(1);
		Node child2 = new Node(2);
		Node child3 = new Node(3);
		Node child4 = new Node(4);
		root.addchild(child2);
        root.addchild(child3);
        root.addchild(child4);
        Node child5 = new Node(5);  
        Node child6 = new Node(6);
        child2.addchild(child5);
        child2.addchild(child6);
        Node child7 = new Node(7);
        child3.addchild(child7);
        Node child8 = new Node(8);  
        Node child9 = new Node(9);
        child3.addchild(child8);
        child4.addchild(child9);

        System.out.println("N-ary Tree created Successfully:");
        System.out.println("Root Node: " + root.data);
        System.out.println("Children of root node: ");
        for (Node child : root.children) {
            System.out.println(child.data+" ");
        }
        System.out.println("Children of node 2: ");
        for (Node child : child2.children) {
            System.out.println(child.data+" ");
        }
        System.out.println("Children of node 3: ");
        for (Node child : child3.children) {
            System.out.println(child.data+" ");
        }
        System.out.println("Children of node 4: ");
        for (Node child : child4.children) {    
            System.out.println(child.data+" ");
        }
	}
    
}