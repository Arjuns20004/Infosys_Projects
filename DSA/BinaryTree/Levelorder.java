import java.util.ArrayList;
import java.util.LinkedList;7
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
…}
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        while(q.size()>0)
        {
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                list.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            res.add(list);

        }
    }
}