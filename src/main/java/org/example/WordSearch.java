package org.example;
// Problem: Given a 2D board and a word, find if the word exists in the grid.
// Example:
// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
// Output: true

public class WordSearch {
    // Implement the function below
    public boolean exist(char[][] board, String word) {
        // Your code here
        int n = board.length, m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 if (searchWord(board, visited, i, j, 0, word)) {
                     return true;
                 }
            }
        }
        return false; // Placeholder return to avoid compilation error
    }

    public boolean searchWord(char[][] board, boolean[][] visited, int i, int j, int index, String  word) {
        if (index == word.length()) {
            return true;
        }
        if (board[i][j] == word.charAt(index)) {
            visited[i][j] = true;
            int n = board.length, m = board[0].length;
            if (i+1<n && searchWord(board, visited, i+1, j, index+1, word)) {
                return true;
            }
            if (i-1>=0 && searchWord(board, visited, i-1, j, index+1, word)) {
                return true;
            }
            if (j+1<m && searchWord(board, visited, i, j+1, index+1, word)) {
                return true;
            }
            if (j-1>=0 && searchWord(board, visited, i, j-1, index+1, word)) {
                return true;
            }
            visited[i][j]=false;

        }
        return false;


    }
}
