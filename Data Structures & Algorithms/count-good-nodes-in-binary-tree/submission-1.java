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
    int count=0;
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        goodNodes(root,Integer.MIN_VALUE);
        return count;
    }

    public void goodNodes(TreeNode node, int maxValue){
        if(node == null){
            return;
        }
        if(maxValue<=node.val){
            count=count+1;
        }
        goodNodes(node.left, Math.max(maxValue,node.val));
        goodNodes(node.right, Math.max(maxValue,node.val));
    }
}
