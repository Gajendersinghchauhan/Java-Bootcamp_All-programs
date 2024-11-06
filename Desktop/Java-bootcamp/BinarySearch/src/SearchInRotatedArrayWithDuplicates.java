public class SearchInRotatedArrayWithDuplicates {
    public static void main(String[] args) {

        int[] arr1 = {1,1,2,3,4,4,2,2,1};
        int target1 = 4;
        int ans1 = SearchInArray(arr1,target1);
        System.out.println(ans1);

        int[] arr = {3,3,4,5,6,6,7,7,7,1,1,2,3};
        int target =4;
        int ans = SearchInArray(arr,target);

        System.out.println(ans);

    }

    static int SearchInArray(int[] nums, int target){
        int pivot = FindPeakIndexInDuplicateRotatedArray(nums);

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

    static int FindPeakIndexInDuplicateRotatedArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start<end){
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid ;
            }

            else if(mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }

            // Here, it is a possibility that nums[mid] == nums[start] == nums[end].... so this case will be different from normal Rotated array search
            else if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                // try to skip the middle elements
                // NOTE:- what if the elements at start and end were the pivots

                // check if start is pivot
                if(nums[start] > nums[start+1]){
                    return start;
                }
                // skipped duplicate if it is not the pivot
                start++;

                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                // Or else skip the end
                end--;
            }

            else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }

        return -1;

    }



    static int binarySearch(int[] arr, int target, int start, int end){

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
