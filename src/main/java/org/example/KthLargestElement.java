package org.example;
// Problem: Find the kth largest element in an array.
// Example:
// Input: nums = [3, 2, 1, 5, 6, 4], k = 2
// Output: 5

import java.util.*;

public class KthLargestElement {
    // Implement the function below
    public int findKthLargest(int[] nums, int k) {
        // Your code here
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
            if(queue.size()>k) {
                queue.poll();
            }
        }
        return queue.peek(); // Placeholder return to avoid compilation error
    }
}
