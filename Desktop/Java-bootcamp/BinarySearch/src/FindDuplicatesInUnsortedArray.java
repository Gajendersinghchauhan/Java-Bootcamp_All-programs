// Not optimized solution as we used first soting and then binanry search...

import java.util.*;

public class FindDuplicatesInUnsortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,5,1,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(nums[start] == nums[mid] || nums[start] == nums[start+1] || nums[start] == nums[end]){
                return nums[start];
            }

            else if(nums[end] == nums[mid] || nums[end] == nums[end-1] || nums[start] == nums[end]){
                return nums[end];
            }

            else{
                start++;
                end--;
            }


        }
        return -1;
    }
}



//Another optimized solution for the same problem solved above...
