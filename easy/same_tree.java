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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        preorder(p,q);
        if(ok==0){
            return true;
        }
        return false;
        
    }
    public void preorder(TreeNode root1,TreeNode root2){
        if((root1==null && root2==null)){
            return;
        }
        if((root1==null && root2!=null) || (root1!=null && root2==null)){
            ok=1;
            return;
        }
        if(root1.val!=root2.val){
            ok=1;
        }
        preorder(root1.left,root2.left);
        preorder(root1.right,root2.right);
    }
}