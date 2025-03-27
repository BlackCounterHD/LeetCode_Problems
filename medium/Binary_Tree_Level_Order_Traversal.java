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
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        
        int size;
        List<List<Integer>> l1=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode curr;
        if(root==null){
            return l1;
        }
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l2=new ArrayList<>();
            size=q.size();
            for(int i=0;i<size;i++){
                curr=q.poll();
                l2.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            l1.add(l2);
        }
        return l1;

    }
}