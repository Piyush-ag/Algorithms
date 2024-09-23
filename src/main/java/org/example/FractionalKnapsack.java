package org.example;
// Problem: Given weights and values of `n` items, put these items in a knapsack of capacity `W` to get the maximum total value in the knapsack.
// Example:
// Input: W = 50, items = [(60, 10), (100, 20), (120, 30)]
// Output: 240.0

import java.util.*;

public class FractionalKnapsack {
    // Implement the function below
    public double fractionalKnapsack(int W, Item[] arr) {
        // Your code here
        double total = 0;
        Arrays.sort(arr, (a, b) -> (b.value/b.weight) - (a).value/a.weight);
        for (int i = 0; i < arr.length; i++) {
            if( W >= arr[i].weight) {
                W-=arr[i].weight;
                total+= arr[i].value;
            } else if (W>0) {
                total += W*(arr[i].value/arr[i].weight);
                W=0;
            } else {
                break;
            }
         }
        return total; // Placeholder return to avoid compilation error
    }
}
