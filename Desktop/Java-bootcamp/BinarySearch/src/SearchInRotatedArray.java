//Find element in rotated array...

public class SearchInRotatedArray {
    public static void main(String[] args) {

        /*
        As we had this doubt that why can not we just divide the array in two part and then apply binary search
        in that like we did in Mountain Array.... It,s because if arr[] = {1}, then it will not be able to find
        the peak element as we applied condition that mid < end, mid > start.... That's why we are making the cases
        */
//        int[] arr = {1};
//        int target = 1;

        int[] arr = {10,11,12,13,14,15,16,17,1,2,3,4,5,6,7,8};
        int target = 7;
        int ans = SearchInArray(arr,target);
        System.out.println(ans);

    }

    static int SearchInArray(int[] nums, int target){
        int pivot = FindPeakIndexInRotatedArray(nums);

        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length - 1);
        }

        if(nums[pivot] == target){
            return pivot;
        }

        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot - 1);
        }

        return binarySearch(nums,target,pivot + 1,nums.length - 1);
    }

    static int FindPeakIndexInRotatedArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start<end){
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid+1]){
               return mid;
            }

            else if(mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }

            else if(nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else{
                start = mid +1 ;
            }

        }

        return -1;

    }

    static int binarySearch(int[] arr, int target,int start, int end){

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
