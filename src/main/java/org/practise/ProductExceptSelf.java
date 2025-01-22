package org.practise;
// Problem: Given an array nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
// Note: Please solve it without division and in O(n) time.
// Example:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

public class ProductExceptSelf {
    // Implement the function below
    public int[] productExceptSelf(int[] nums) {
        // Your code here
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        if (nums.length ==1) {
            return new int[]{1};
        }

        int[] results = new int[nums.length];
        results[0] = 1;
        for (int i = 1; i < nums.length ; i++) {
            results[i] = results[i-1]*nums[i-1];

        }
        int right =1;
        for (int i = nums.length-1; i >=0; i--) {
            results[i] *= right;
            right*=nums[i];
        }
        return results; // Placeholder return to avoid compilation error
    }
    // 1, 2, 3, 4,
    // 1, 1, 1, 1 initial results
    // 1, 1, 2, 6
    // , , 8, 6
}
