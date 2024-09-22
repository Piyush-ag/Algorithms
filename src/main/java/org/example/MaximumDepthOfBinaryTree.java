package org.example;
// Problem: Given a binary tree, find its maximum depth.
// Example:
// Input: root = [3,9,20,null,null,15,7]
// Output: 3

public class MaximumDepthOfBinaryTree {

    // Implement the function below
    public int maxDepth(TreeNode root) {
        // Your code here
        if (root == null) return 0;
        int left = maxDepth((root.left));
        int right = maxDepth(root.right);
        return Math.max(left, right) +1; // Placeholder return to avoid compilation error
    }
}
