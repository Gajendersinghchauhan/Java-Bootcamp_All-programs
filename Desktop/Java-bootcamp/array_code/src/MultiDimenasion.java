import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenasion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*

          4 5 6
          1 2 3
          7 8 9

         */

//        int[][] mat2 = {
//                {1,2}, // 0th index
//                {3,4,5}, // 1st index
//                {6,7,8,9}}; // 2nd index --> mat2[2] = {6,7,8,9}

        int[][] mat = new int[3][3];
        System.out.println(mat.length);

        //INPUT....
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[row].length; col++){
                mat[row][col] = sc.nextInt();
            }
        }


        //OUTPUT....
        //Using two for loops
//        for(int row = 0; row < mat.length; row++){
//            for(int col = 0; col < mat[row].length; col++){
//                System.out.print(mat[row][col] + " ");
//            }
//            System.out.println();
//        }


        //Using array.toString method
        for(int row = 0; row < mat.length; row++){
                System.out.println(Arrays.toString(mat[row]));
        }


        //Using enhanced for loop
//        for(int[] a:mat){
//            System.out.println(Arrays.toString(a));
//        }



    }
}
