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
    List<Integer> list = new ArrayList();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null ){
            return new ArrayList();
        }
        preOrderTraversal(root);
        return list;
    }

    public void preOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            list.add(node.val);
            return;
        }
        list.add(node.val);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        
    }
}