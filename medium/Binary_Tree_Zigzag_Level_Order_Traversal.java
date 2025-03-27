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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int size,step=0;
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
            if(step%2==0){
                for(int i=0;i<size;i++){
                    curr=q.poll();
                    l2.add(curr.val);
                    if (curr.left != null) q.add(curr.left);
                    if (curr.right != null) q.add(curr.right);
                }
            }
            else{
                Stack<Integer> s=new Stack<>();
                for(int i=0;i<size;i++){
                    curr=q.poll();
                    s.push(curr.val);
                    if (curr.left != null) q.add(curr.left);
                    if (curr.right != null) q.add(curr.right);
                }
                while (!s.isEmpty()) {
                    l2.add(s.pop());
                }

            }
            l1.add(l2);
            step++;
        }
        return l1;
    }
}