// Problem: https://leetcode.com/problems/range-sum-query-2d-immutable/


/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

class NumMatrix {
    int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = new int[matrix.length+1][matrix[0].length+1];

        for (int row=0; row<matrix.length; row++) {
            for (int col=0; col<matrix[0].length; col++) {
                this.matrix[row+1][col+1] =
                        matrix[row][col] + this.matrix[row][col+1] + this.matrix[row+1][col] - this.matrix[row][col];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return this.matrix[row2+1][col2+1] -
                (this.matrix[row1][col2+1] + this.matrix[row2+1][col1] - this.matrix[row1][col1]);
    }
}
