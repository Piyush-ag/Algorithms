package org.example;
// Problem: Find the contiguous subarray within a one-dimensional array of numbers which has the largest sum.
// Example:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6 (subarray [4,-1,2,1] has the largest sum = 6)

public class MaximumSubarray {
    // Implement the function below
    public int maxSubArray(int[] nums) {
        // Your code here
        if (nums == null || nums.length ==0 )
            return 0;
        int max_global =  0;
        int max_local = 0;

        for (int num: nums) {
            max_local = Math.max(num, max_local + num);
            if(max_global< max_local) {
                max_global = max_local;
            }
        }
        return max_global; // Placeholder return to avoid compilation error
    }
}
