package org.example;
// Problem: An efficient, stable, comparison-based, divide-and-conquer sorting algorithm.
// Example:
// Input: arr = [12, 11, 13, 5, 6, 7]
// Output: [5, 6, 7, 11, 12, 13]

import java.util.Arrays;

public class MergeSort {
    // Implement the function below
    public void mergeSort(int[] arr, int left, int right) {
        // Your code here
        if(left < right) {
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    
    // Helper method for merging sorted subarrays
    public void merge(int[] arr, int left, int middle, int right) {
        // Your code here
        int l = middle -left +1;
        int r = right -middle;
        int[] n1 = new int[l];
        int[] n2 = new int[r];

        System.arraycopy(arr, left, n1, 0, l);
        System.arraycopy(arr, middle+1, n2, 0, r);

        int i=0, j = 0, k=left;
        while(i<l && j<r) {
            if (n1[i]<n2[j]) {
                arr[k]=n1[i];
                i++;
                k++;
            }else {
                arr[k]=n2[j];
                j++;
                k++;
            }
        }
        while(i<l) {
            arr[k]=n1[i];
            k++;i++;
        }
        while(j<r) {
            arr[k]=n2[j];
            k++;j++;
        }
    }
}
