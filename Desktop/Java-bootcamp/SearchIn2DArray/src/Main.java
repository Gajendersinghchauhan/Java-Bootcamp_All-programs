/*
You need to search an element in a 2D array whose rows and columns are separately sorted in O(n) time complexity.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 35;

        System.out.println(Arrays.toString(searchIn2D(mat,37)));
    }

    static int[] searchIn2D(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0 ){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] > target){
                col--;
            }
            else {
                row++;
            }
        }

        return new int[]{-1,-1};
    }
}