package org.example;
// Problem: Given a string, find the length of the longest substring without repeating characters.
// Example:
// Input: s = "abcabcbb"
// Output: 3 (substring is "abc")

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    // Implement the function below
    public int lengthOfLongestSubstring(String s) {
        // Your code here
        if (s == null || s.isEmpty()) return 0;
        Set<Character> set = new HashSet<>();
        int length = 0;
        int right = 0, left = 0;

        while (right < s.length()) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            length = Math.max(length, right - left + 1);
            right++;

        }
        return length; // Placeholder return to avoid compilation error
    }
}
