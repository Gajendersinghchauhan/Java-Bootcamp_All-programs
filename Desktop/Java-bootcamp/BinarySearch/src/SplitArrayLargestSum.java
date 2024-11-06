// We need to split the array in m sections so that the largest sun of any subarray be minimized...

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;

        int sum = splitArray(arr,m);
        System.out.println(sum);
    }

    public static int splitArray(int[] nums, int k){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]); // In the end it basically contains the largest element in the array
            end += nums[i];
        }

        //binary search
        while(start < end){
            // try for this mid as the potential ans
            int mid = start + (end - start)/2 ;

            // Calculate in how many pieces you can divide the array to get maximum sum
            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                // This is basically the base case as when we start adding nums to sum as we go left to right in array,eventually it will become greater than mid at that time we execute this condition
                if(sum + num > mid){
                    // you can not add this to subarray, make new one
                    // when you will make a new subarray to add this num, then value of sum in new subarray initially becomes as , sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }

        return end; // here start == end

    }
}
