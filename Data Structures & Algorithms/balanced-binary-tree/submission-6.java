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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int h = height(root);
        if(h==-1){
            return false;
        }
        return true;
    }

    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }
        int left = height(node.left);
        if(left == -1){
            return -1;
        }
        int right = height(node.right);
        if(right == -1){
            return -1;
        }
        if(Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;

    }
}
