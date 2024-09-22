package org.example;
// Problem: Given a list of coin denominations and a target amount, find the minimum number of coins needed to make the target amount.
// Example:
// Input: coins = [1,2,5], amount = 11
// Output: 3

import java.util.*;

public class CoinChange {
    // Implement the function below
    public int coinChange(int[] coins, int amount) {
        // Your code here
        int[] changes = new int[amount+1];
        Arrays.fill(changes, amount+1);
        changes[0]=0;
        for (int i = 1; i <=amount ; i++) {
            for(int c: coins) {
                if (i>=c) {
                    changes[i] = Math.min(changes[i], changes[i-c]+1);
                }
            }
        }
        return changes[amount]!=amount+1?changes[amount]:-1; // Placeholder return to avoid compilation error
    }
}
