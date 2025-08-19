import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class levelorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.println("Enter tree nodes in level order (use 'null' for no node):");
        String input = sc.nextLine();
        String[] values = input.split(" ");

        // Build tree
        TreeNode root = buildTree(values);

        // Level Order Traversal
        System.out.println(levelOrder(root));
    }

    // Build tree from level order array
    public static TreeNode buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode curr = queue.poll();

            // Left child
            if (i < values.length && !values[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(values[i]));
                queue.add(curr.left);
            }
            i++;

            // Right child
            if (i < values.length && !values[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(values[i]));
                queue.add(curr.right);
            }
            i++;
        }
        return root;
    }
    
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            result.add(level);
        }
        return result;
    }
}