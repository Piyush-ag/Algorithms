package org.practise;
// Problem: You are climbing a staircase. Each time you can either climb 1 or 2 steps. How many distinct ways can you reach the top?
// Example:
// Input: n = 3
// Output: 3

public class ClimbingStairs {
    // Implement the function below
    public int climbStairs(int n) {
        // Your code here
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        int[] steps = new int[n+1];
        steps[1]=1;
        steps[2]=2;
        for (int i = 3; i <= n; i++) {
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[n]; // Placeholder return to avoid compilation error
    }
}
