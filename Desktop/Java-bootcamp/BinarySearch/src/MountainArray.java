public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,4,1};
        int target = 4;
        int ans = SearchInArray(arr,target);
        System.out.println(ans);

    }

    static int SearchInArray(int[] arr, int target){
        int start = 0;
        int end = FindPeakIndexInMountainArray(arr);

        int ans = orderAsnosticBS(arr, target, start, end);

        if(ans == -1){
            ans = orderAsnosticBS(arr,target,end,arr.length - 1);
        }

        return ans;
    }

    static int FindPeakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length;

        while(start<end){
            int mid = start + (end - start) / 2;

            if(arr[mid]>arr[mid+1]){
                // It means that you are in the decreasing part of mountain array..
                // i.e. It can be peak index but still check on the left, there might be bigger elements
                end = mid; // we include mid and not 'mid-1' because mid can be potentially peak index.
            }

            else{
                // It means that we are in decreasing part of array
                // We must check the right part as 'mid+1' is greater than 'mid'
                start = mid + 1;
            }

        }

        //loop terminates when start == end because of the 2 check cases we used above
        // It means the start index or the end index will be the peak index when start become equal to end
        //At the end we return start or end, it will give the same ans;

        return start;

    }

    static int orderAsnosticBS(int[] arr, int target, int start, int end){

        while(start <= end ){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[start]<arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }

            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;
    }
}

