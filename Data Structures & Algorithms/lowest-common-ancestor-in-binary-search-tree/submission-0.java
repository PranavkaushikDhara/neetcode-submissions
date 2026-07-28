class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findLowestParent(root, p, q);
    }

    public TreeNode findLowestParent(TreeNode node, TreeNode p, TreeNode q) {
        if (node.val > p.val && node.val > q.val) {
            return findLowestParent(node.left, p, q);
        }
        if (node.val < p.val && node.val < q.val) {
            return findLowestParent(node.right, p, q);
        }
        return node;
    }
}