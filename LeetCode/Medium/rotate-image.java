// Problem: https://leetcode.com/problems/rotate-image/


class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp;

        for (int i=0; i<n/2; i++) {
            for (int j=0; j<n; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = temp;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=i+1 ;j<n; j++) {
                if (i != j) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }
}