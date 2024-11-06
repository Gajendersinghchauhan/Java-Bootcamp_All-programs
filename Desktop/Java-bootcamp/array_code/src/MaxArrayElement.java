import java.util.Arrays;

public class MaxArrayElement {
    public static void main(String[] args) {
        int[] arr = {1,22,44,563,42};
        System.out.println(max(arr));

        int n = arr.length;
        reverse(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[]arr , int n){
        int start = 0;
        int end = n-1;

        while(start <= end){
            int temp = arr[start] ;
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    static int max(int[] arr) {
        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
               max=arr[i];
            }
        }
        return max;
    }
}
