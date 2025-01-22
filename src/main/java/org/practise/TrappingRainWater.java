package org.practise;
// Problem: Given n non-negative integers representing an elevation map where the width of each bar is 1, 
// compute how much water it can trap after raining.
// Example:
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6

public class TrappingRainWater {
    // Implement the function below
    public int trap(int[] height) {
        // Your code here
        if(height == null || height.length ==0) {
            return 0;
        }
        int num = height.length;
        if( num==1)
            return 0;
        int[] left = new int[num];
        int[] right = new int[num];
        left[0]= height[0];

        for (int i = 1; i < num ; i++) {
            left[i] = Math.max(height[i], left[i-1]);
        }
        right[num-1]= height[num-1];
        for (int i = num-2; i >=0 ; i--) {
            right[i] = Math.max(height[i], right[i+1]);
        }
        int total = 0;
        for (int i = 0; i < num; i++) {
            if( left[i] > height[i] && right[i] > height[i]) {
                total += Math.min(left[i], right[i])- height[i];
            }
        }


        return total; // Placeholder return to avoid compilation error
    }
}
