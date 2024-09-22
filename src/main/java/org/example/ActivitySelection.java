package org.example;
// Problem: Given `n` activities with their start and finish times, select the maximum number of activities that can be performed by a single person.
// Example:
// Input: start = [1, 3, 2], finish = [2, 4, 3]
// Output: [0, 2]

import com.beust.ah.A;

import java.util.*;

public class ActivitySelection {
    // Implement the function below
    public List<Integer> activitySelection(int[] start, int[] finish) {
        // Your code here
        if (start == null || start.length ==0) {
            return new ArrayList<>();
        }
        if (start.length==1)
            return new ArrayList<>(List.of(0));
        int[][] se = new int[start.length][2];
        for (int i = 0; i <start.length ; i++) {
            se[i][0]=start[i];
            se[i][1]=finish[i];
        }
        Arrays.sort(se, (a, b) -> a[1]-b[1]);
        int finish_local = se[0][1];
        List<Integer> results = new LinkedList<>(List.of(0));
        for (int i = 1; i < se.length; i++) {
            if(finish_local<=se[i][0]) {
                finish_local = se[i][1];
                results.add(i);
            }
        }
        return results; // Placeholder return to avoid compilation error
    }
}
