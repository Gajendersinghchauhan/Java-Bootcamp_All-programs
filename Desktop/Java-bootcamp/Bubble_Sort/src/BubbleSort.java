// Implementing bubble sort algorithm

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,-11,3,6,4,2,0,263,2,13};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }

    static int[] BubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int flag = 0;
            for(int j = 1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = 1;
                }
            }

            //We have added this condition because if no swap occured for a certain value of i then the array has been sorted, so we do not need to go in the loop again....
            if(flag == 0){
                break;
            }
        }
        return arr;
    }
}