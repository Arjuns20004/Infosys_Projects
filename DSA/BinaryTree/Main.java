import java.util.*;
public class Main
{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public void print(Node root){
        if(root == null) System.out.print("N");
        return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int nonnull=1;
        while(!queue.isEmpty()&&nonnull>0){
            Node curr = queue.poll();
            if(curr == null){
                System.out.print("N");
                continue;
            }
            nonnull--;
        }
    }
    
}