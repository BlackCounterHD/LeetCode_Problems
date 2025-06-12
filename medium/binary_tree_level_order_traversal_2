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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        levels(root,l);
        return l;
    }
    public void levels(TreeNode root,List<List<Integer>> l){
        if(root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        Stack<List<Integer>> s=new Stack<>();
        TreeNode curr;
        int size;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l2=new ArrayList<>();
            size=q.size();
            for(int i=0;i<size;i++){
                curr=q.poll();
                l2.add(curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            s.push(l2);
        }
        while(!s.isEmpty()){
            l.add(s.pop());
        }
    }
}