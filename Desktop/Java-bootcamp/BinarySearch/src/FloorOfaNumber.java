//To find the greatest element in array which is smaller than or equal to target element....

public class FloorOfaNumber {
    public static void main(String[] args) {

        //REM. THE ARRAY MUST BE SORTED.....
        int[] arr = {7,34,44,65,67,68,87,89,887,889};
        int target = 64;
        int ans = GreaterOrEqualToTarget(arr,target);
        System.out.println(ans);
    }

    static int GreaterOrEqualToTarget(int[] arr, int target){

        // ***** What is the target number is smaller than all elements in the given array than there will be no such element that is greatest number smaller than or equal to target element ....
        if(target < arr[0]){
            return -1;
        }

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
                return arr[mid];
            }

        }
        return arr[end];
    }
}
