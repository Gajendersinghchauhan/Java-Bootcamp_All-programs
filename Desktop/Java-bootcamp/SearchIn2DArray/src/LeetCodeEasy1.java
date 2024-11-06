/*
FIND LUCKY NUMBERS IN A MATRIX
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

"Question Link -> https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/"
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCodeEasy1 {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        //we need to initialise an Arraylist in order to return answer in Array list format
        List<Integer> luckyNumbers = new ArrayList<>();

        // Here basically we are travering in each row normally or one by one
        for (int i = 0; i < matrix.length; i++) {
            int minRowValue = Integer.MAX_VALUE;
            int minColIndex = -1;

            // Here we are checking in columns
            //We are checking which column in ith row is minimum among all the elements in that row
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    minColIndex = j;
                }
            }

            //Now that we have our minimum element in ith row
            //We will check if its the maximum element in all rows in minCol
            boolean isLucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minColIndex] > minRowValue) {
                    isLucky = false;
                    break;
                }
            }

            //If the number is minimum in ith row and maximum in minCol.. We will return it as the answer
            if (isLucky) {
                luckyNumbers.add(minRowValue);// here we are adding that number to list that we previously initialised
            }
        }

        return luckyNumbers;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

        List<Integer> luckyNumbers = luckyNumbers(matrix);
        System.out.println("Lucky Numbers: " + luckyNumbers); // Output: [15]
    }
}
