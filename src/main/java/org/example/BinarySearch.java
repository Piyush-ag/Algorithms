package org.example;
// Problem: Search a sorted array by repeatedly dividing the search interval in half.
// Example:
// Input: arr = [2, 3, 4, 10, 40], target = 10
// Output: 3

public class BinarySearch {
    // Implement the function below
    public int binarySearch(int[] arr, int target) {
        // Your code here
        int left =0, right = arr.length-1;
        while(left<=right) {
            int mid = (left  + right)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid]>target) {
                right = mid -1;

            }else {
                left = mid +1;
            }
        }
        return -1; // Placeholder return to avoid compilation error
    }
}
