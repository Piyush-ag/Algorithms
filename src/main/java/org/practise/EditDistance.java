package org.practise;
// Problem: Given two strings, find the minimum number of operations (insertions, deletions, or substitutions) required to convert one string into the other.
// Example:
// Input: word1 = "horse", word2 = "ros"
// Output: 3

public class EditDistance {
    // Implement the function below
    public int minDistance(String word1, String word2) {
        // Your code here
        int[][] dist = new int[word1.length()+1][word2.length()+1];
        for (int i = 1; i <=word1.length() ; i++) {
            dist[i][0]=i;
        }
        for (int i = 1; i <= word2.length(); i++) {
            dist[0][i]=i;
        }

        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {

                if(word1.charAt(i-1)==word2.charAt(j-1)) {
                    dist[i][j]=dist[i-1][j-1];
                } else {
                    int delete = dist[i-1][j];
                    int insert = dist[i][j-1];
                    int replace = dist[i-1][j-1];

                    dist[i][j]= Math.min(delete, Math.min(replace, insert))+1;

                }


            }
        }
        return dist[word1.length()][word2.length()]; // Placeholder return to avoid compilation error
    }
}
