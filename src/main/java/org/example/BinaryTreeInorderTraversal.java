package org.example;
// Problem: Given a binary tree, return the inorder traversal of its nodes' values.
// Example:
// Input: root = [1,null,2,3]
// Output: [1,3,2]

import java.util.*;

public class BinaryTreeInorderTraversal {


    // Implement the function below
    public List<Integer> inorderTraversal(TreeNode root) {
        // Your code here
        List<Integer> result = new LinkedList<>();
        buildResult(root, result );
        return result; // Placeholder return to avoid compilation error
    }

    public void buildResult(TreeNode root, List result) {
        if (root != null) {
            buildResult(root.left, result);
            result.add(root.val);
            buildResult(root.right, result);
        }
    }
}

