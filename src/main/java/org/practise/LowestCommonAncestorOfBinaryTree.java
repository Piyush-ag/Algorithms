package org.practise;
// Problem: Given a binary tree, find the lowest common ancestor (LCA) of two nodes.
// Example:
// Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
// Output: 3

public class LowestCommonAncestorOfBinaryTree {

    // Implement the function below
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Your code here
        if (root == p || root == q || root == null) {
            return  root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }
        return left == null? right : left; // Placeholder return to avoid compilation error
    }
}
