package org.practise;
/**
 * Problem: Given a matrix, return all elements of the matrix in spiral order.
 * Approach: Use four pointers to traverse the matrix in spiral order.
 */
import java.util.LinkedList;
import java.util.List;

public class SpiralOrderTraversal {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Placeholder return statement to avoid compilation errors
        List<Integer> result = new LinkedList<>();
        int top =0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1;

        while(top<=bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom) {
                for (int i = right; i >=left ; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left<= right) {
                for (int i = bottom; i >=top ; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
