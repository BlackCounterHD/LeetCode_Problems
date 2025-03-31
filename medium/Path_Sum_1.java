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
    int ok=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        preorder(root,targetSum);
        if(ok==0){
            return false;
        }
        return true;

    }
    public void preorder(TreeNode root,int targetSum){
        if(root==null){
            return;
        }
        if(targetSum==root.val && root.left==null && root.right==null){
            ok=1;
        }
        preorder(root.left,targetSum-root.val);
        preorder(root.right,targetSum-root.val);
    }
}