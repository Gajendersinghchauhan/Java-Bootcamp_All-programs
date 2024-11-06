/*
PROBLEM STATEMENT !

A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left,
right, top, and bottom.

Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return
the length 2 array [i,j].

You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.

You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.
 */


public class LeetcodeMedium1 {
    public static int[] findPeakElement(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // Start the binary search on columns
        return binarySearchOnColumns(mat, 0, n - 1, m);
    }

    public static int[] binarySearchOnColumns(int[][] mat, int left, int right, int m) {
        while (left <= right) {
            int midCol = left + (right - left) / 2;
            int maxRow = 0;

            // Find the row with the maximum value in midCol
            for (int row = 0; row < m; row++) {
                if (mat[row][midCol] > mat[maxRow][midCol]) {
                    maxRow = row;
                }
            }

            // Check if this maxRow element is a peak
            boolean isPeak = true;

            /*
           As in solution below we are checking for all directions such as left and right as well as top and bottom but
           as out previous 'for' loop gives us the greatest element in that column it obviously means that it is already
           known that the gretest element in the column is greater than its adjacent top and adjacent bottom element.
           Therefore, we only need to check for its adjacent right and adjacent left.
             */

            // Check top neighbor
//            if (maxRow > 0 && mat[maxRow][midCol] < mat[maxRow - 1][midCol]) {
//                isPeak = false;
//            }
            // Check bottom neighbor
//            if (maxRow < m - 1 && mat[maxRow][midCol] < mat[maxRow + 1][midCol]) {
//                isPeak = false;
//            }


            // Check left neighbor
            if (midCol > 0 && mat[maxRow][midCol] < mat[maxRow][midCol - 1]) {
                isPeak = false;
            }
            // Check right neighbor
            if (midCol < mat[0].length - 1 && mat[maxRow][midCol] < mat[maxRow][midCol + 1]) {
                isPeak = false;
            }


            // Now we are checking if the current element is peak element or not ... if isPeak is true then it is peak element
            if (isPeak) {
                return new int[]{maxRow, midCol}; // Found a peak
            }

            //If the current element is not peak then we move either left or right in column
            else {
                // Move to the side with the higher neighbor
                if (midCol > 0 && mat[maxRow][midCol - 1] > mat[maxRow][midCol]) {
                    right = midCol - 1; // Move left
                } else {
                    left = midCol + 1; // Move right
                }
            }
        }

        // If no peak is found (which should not happen), return an empty array
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        // Test case
//        int[][] mat = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };


//        int[][] mat = {
//                {1,4},
//                {3,2}
//        };

        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,32}
        };

        int[] peak = findPeakElement(mat);
        System.out.println("Peak Element found at: [" + peak[0] + ", " + peak[1] + "]");
    }
}
