/*
Basically we need to search the target element in a completed sorted array in (log m + log n)...
 */

import java.util.Arrays;

public class SearchInsorted2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int target = 9;

        System.out.println(Arrays.toString(searchInSorted2D(matrix,target)));
    }

    // It will search in the provides row and between provided columns
    static int[] binarySeach2D(int[][] mat, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(mat[row][mid] == target){
                return new int[] {row,mid};
            }
            else if(mat[row][mid] < target){
                cStart = mid + 1;
            } else{
                cEnd = mid - 1;
            }
        }

        return new int[] {-1,-1};
    }

    static int[] searchInSorted2D(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        // If the matix contains only one row so basically it is a 1-D array so we will apply normal binary search
        if(rows==1){
            return binarySeach2D(matrix, 0, 0, cols - 1, target );
        }

        // Now we have to write the main algorithm
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        //This is the main loop and it will run until only two rows are remaining
        while(rStart < (rEnd - 1)){ // This condition will run until only two rows are remaining..
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        /*
        This is the 2nd and 3rd step as mentioned in the notebook, we will apply binary search in col we are present in
        and if the element is not found in that column we will apply binary search in all four rows that our matrix is
        divided one by one..
         */

        // Check whether the target is present in column
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }


        //Now we will check in all those four parts in which our array is divided..

        //1st part
        if(target < matrix[rStart][cMid]){
            return binarySeach2D(matrix, rStart, 0, cMid-1, target);
        }

        //2nd part
        if(target > matrix[rStart][cMid] && matrix[rStart][cols-1] >= target){
            return binarySeach2D(matrix, rStart, cMid + 1, cols -1, target);
        }

        //3rd part
        if(target < matrix[rStart+1][cMid]){
            return binarySeach2D(matrix, rStart+1, 0, cMid-1, target);
        }

        //4th part
        if(target > matrix[rStart+1][cMid]){
            return binarySeach2D(matrix, rStart+1, cMid + 1, cols-1, target);
        }

        return new int[]{-1,-1};

    }
}
