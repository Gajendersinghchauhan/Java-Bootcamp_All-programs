/*
TRANSPOSE MATRIX
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

"Question Link -> https://leetcode.com/problems/transpose-matrix/description/"
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCodeEasy2 {
    public static void main(String[] args) {
        //Matrix = [[1,2,3],[4,5,6],[7,8,9]]
        //Transpose = [[1,4,7],[2,5,8],[3,6,9]]
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //This is how we can print a 2D matrix using Arrays.toSting method... VERY IMP.
        for (int[] row : transpose(mat)) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        //The key point in this question is basically creating a new matrix
        //We can not change the current matrix because it has some different order and the order changes when we take transpose of a matrix
        int[][] transposed = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }
}
