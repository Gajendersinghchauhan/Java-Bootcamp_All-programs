// This is a question where you need to find the smallest element in array which is greater than or equals to target..


public class CeilingOfaNumber {
    public static void main(String[] args) {

        //REM. THE ARRAY MUST BE SORTED.....
        int[] arr = {7,34,44,65,67,68,87,89,887,889};
        int target = 890;
        int ans = GreaterOrEqualToTarget(arr,target);
        System.out.println(ans);
    }

    static int GreaterOrEqualToTarget(int[] arr, int target){

        // +*****Important base condition when the target is greater than all elements present in the given array then there can be no such element that is a smallest number greater than equal to target...
        if(target > arr[arr.length - 1]){
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
        return arr[start];
    }
}
