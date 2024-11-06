import java.util.Arrays;

public class SearchIn2D {

    public static void main(String[] args) {

        int[][] mat = {
                {23,43,55},
                {33,66,88},
                {21,67,44}
        };

        int target = 88;
        int[] ans = search2D(mat,target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(mat));

        System.out.println(Integer.MIN_VALUE); // by default minimum value for integers....
    }


    //Searching the element in 2D array....
    static int[] search2D(int[][] mat, int target){

        for(int i=0; i<mat.length;i++){
            for(int j=0; j<mat[i].length;j++){
                if(target == mat[i][j]){
                    return new int[]{i,j}; // Here we used 'new' keyword because in the main function we did not initialised this array...
                }
            }
        }

        return new int[]{-1,-1};
    }


    // Finding maximum element un 2D array....
    static int max(int[][] mat){
        int max = Integer.MIN_VALUE;

        // using normal for loop
//        for(int i=0; i<mat.length;i++){
//            for(int j=0; j<mat[i].length;j++){
//                if(max < mat[i][j]){
//                    max = mat[i][j];
//                }
//            }
//        }

        // using enhanced for loop
        for (int[] ints : mat) {
            for (int j = 0; j < ints.length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
        }

        return max;
    }
}
