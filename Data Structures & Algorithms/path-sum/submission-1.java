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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return hasPathSum(root,targetSum,0);
    }

    public boolean hasPathSum(TreeNode node, int targetSum, int currentSum){
        if(node == null){
            return false;
        }
        if(node.left==null && node.right == null){
            if(currentSum + node.val == targetSum){
                return true;
            } 
            return false;
        }
        boolean left = hasPathSum(node.left,targetSum,currentSum+node.val);
        boolean right = hasPathSum(node.right,targetSum,currentSum+node.val);

        return left || right;
    }
}