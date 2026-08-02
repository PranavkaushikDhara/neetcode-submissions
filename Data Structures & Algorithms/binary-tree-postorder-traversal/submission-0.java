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
    ArrayList<Integer> postOrder = new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        getPostOrderTraversal(root);
        return postOrder;
    }
    public void getPostOrderTraversal(TreeNode node) {
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            postOrder.add(node.val);
            return;
        }
        getPostOrderTraversal(node.left);
        getPostOrderTraversal(node.right);
        postOrder.add(node.val);
    }
}