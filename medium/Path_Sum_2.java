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
    List<List<Integer>> l1=new ArrayList<>();
    List<Integer> l2=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        preorder(root,targetSum);
        return l1;
    }
    public void preorder(TreeNode root,int targetSum){
        if(root==null){
            return;
        }
        l2.add(root.val);
        if(targetSum==root.val && root.left==null && root.right==null){
            l1.add(new ArrayList<>(l2));

        }
        preorder(root.left,targetSum-root.val);
        preorder(root.right,targetSum-root.val);
        l2.remove(l2.size()-1);
    }
}