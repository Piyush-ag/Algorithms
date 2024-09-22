package org.example;
// Problem: Given an array of integers and a target value, return the indices of the two numbers that add up to the target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// Example:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1] (Because nums[0] + nums[1] == 9)

import java.util.*;

public class TwoSum {
    // Implement the function below
    public int[] twoSum(int[] nums, int target) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int remaining = target-nums[i];
            if(map.containsKey(remaining)) {
                return new int[] {map.get(remaining), i};
            }
            map.put(nums[i], i);
        }

        return new int[0]; // Placeholder return to avoid compilation error
    }
}
