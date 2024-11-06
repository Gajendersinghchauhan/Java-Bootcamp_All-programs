public class BinarySearch {
    public static void main(String[] args) {

        //REM. THE ARRAY MUST BE SORTED.....
        int[] arr = {7,34,44,65,67,68,87,89,887,889};
        int target = 68;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1   ;

        while(start <= end ){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }

            else if(target > arr[mid]){
                start = mid + 1;
            }

            else {
                return mid;
            }

        }
        return -1;
    }
}





























