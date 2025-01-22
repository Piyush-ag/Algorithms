package org.practise;
// Problem: The n-queens puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.
// Example:
// Input: n = 4
// Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]

import java.util.*;

public class NQueens {
    // Implement the function below
    public List<List<String>> solveNQueens(int n) {
        // Your code here
        char[][] positions = new char[n][n];
        List<List<String>> results = new LinkedList<>();

        for (char[] pos : positions) {
            Arrays.fill(pos, '.');
        }
        backtracking(0, results, positions);

        return results; // Placeholder return to avoid compilation error
    }

    public void backtracking(int row, List<List<String>> results, char[][] positions) {
        if (row == positions.length) {
            List<String> res = new LinkedList<>();
            for(char[] str: positions) {
                String string = new String(str);
                res.add(string);
            }
            results.add(res);
            return;
        }

        for (int i = 0; i < positions.length; i++) {
            if (isValid(row, i, positions)) {
                positions[row][i]='Q';
                backtracking(row+1, results, positions);
                positions[row][i]='.';
            }
        }

    }

    public boolean isValid(int i, int j, char[][] positions) {

        for (int k = 0; k < positions.length ; k++) {
            if (positions[k][j] == 'Q') {
                return false;
            }
        }

        for (int k = i-1, l=j-1; k >=0 && l>=0; k--, l--) {
            if (positions[k][l]=='Q')
                return false;
        }

        for (int k = i-1, l=j+1; k >=0 && l<positions.length; k--, l++) {
            if (positions[k][l]=='Q')
                return false;
        }
        return true;
    }
}
