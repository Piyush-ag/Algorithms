package org.practise;
// Problem: Given an integer array, find the length of the longest increasing subsequence.
// Example:
// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4

import java.util.*;

public class LongestIncreasingSubsequence {
    // Implement function below
    public int lengthOfLIS(int[] nums) {
        // Your code here
        if (nums==null || nums.length==0)
            return 0;
        int[] lengths = new int[nums.length];
        Arrays.fill(lengths, 1);
        int result = 1;
        for (int i = 1; i < lengths.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if (nums[j]<nums[i]) {
                    lengths[i] = Math.max(lengths[i], lengths[j]+1);
                    result = Math.max(result, lengths[i]);
                }
            }
        }
        return result; // Placeholder return to avoid compilation error
    }
}
