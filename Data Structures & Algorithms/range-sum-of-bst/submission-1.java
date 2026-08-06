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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            if(root.val>=low && root.val<=high){
                return root.val;
            }
            return 0;
        }
        int left = 0;
        if(root.val>=low)
        left = rangeSumBST(root.left,low,high);
        int right = 0;
        if(root.val<=high)
        right = rangeSumBST(root.right,low,high);

        return (root.val>=low && root.val<=high)?(root.val+left+right):left+right;
    }
}