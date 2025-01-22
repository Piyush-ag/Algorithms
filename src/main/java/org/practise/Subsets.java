package org.practise;
// Problem: Given a set of distinct integers, return all possible subsets.
// Example:
// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

import java.util.*;

public class Subsets {
    // Implement the function below
    public List<List<Integer>> subsets(int[] nums) {
        // Your code here
        List<List<Integer>> result = new LinkedList<>();
        buildSubSets(nums, 0, result, new LinkedList<>());
        return result; // Placeholder return to avoid compilation error
    }

    public void  buildSubSets(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
        if (index == nums.length) {
            res.add(subset);
            return;
        }
        List<Integer> sub1 = new LinkedList<>(subset);
        sub1.add(nums[index]);


        buildSubSets(nums,index+1, res, subset);
        buildSubSets(nums, index+1, res, sub1);
    }
}
