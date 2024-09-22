package org.example;
// Problem: Given a string, find the longest palindromic substring.
// Example:
// Input: s = "babad"
// Output: "bab" or "aba"

public class LongestPalindromicSubstring {
    // Implement the function below
    public String longestPalindrome(String s) {
        // Your code here
        if (s == null || s.length() == 0)
            return "";
        if (s.length() ==1)
            return  s;
        int[] res = new int[]{0, 0};

        for (int i = 0; i <s.length() ; i++) {
            int[] odd = findMaxLength(s, i, i+1);
            int[] even = findMaxLength(s, i, i);
            if(odd[1]-odd[0] > res[1]-res[0]) {
                res = odd;
            }
            if(even[1]-even[0] > res[1]-res[0]) {
                res = even;
            }
        }


        return s.substring(res[0], res[1]+1); // Placeholder return to avoid compilation error
    }

    public int[] findMaxLength(String s, int left, int right) {
        int[] res = new int[] {-1, -1};

        while(left >=0 && right <s.length() && s.charAt(left) == s.charAt(right)) {
            res = new int[]{left ,right};
            left--;
            right++;
        }
        return res;
    }
}
