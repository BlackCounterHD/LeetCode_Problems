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
    int nr=0;
    public int pathSum(TreeNode root, int targetSum) {
        preorder1(root,targetSum);
        return nr;
    }
    public void preorder1(TreeNode root,int targetSum){
        if(root==null){
            return;
        }
        preorder2(root,0,targetSum);
        preorder1(root.left,targetSum);
        preorder1(root.right,targetSum);
    }
    public void preorder2(TreeNode root,long sum,int targetSum){
        if(root==null){
            return;
        }
        sum += root.val;
        if (sum == targetSum) {
            nr++;
        }
        preorder2(root.left,sum,targetSum);
        preorder2(root.right,sum,targetSum);
    }
}