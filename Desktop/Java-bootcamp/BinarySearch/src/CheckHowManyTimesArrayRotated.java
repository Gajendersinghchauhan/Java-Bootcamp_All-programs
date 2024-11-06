public class CheckHowManyTimesArrayRotated {
    public static void main(String[] args) {
        int[] arr = {10,11,12,13,14,15,18,2,3,4,5,6,7,8};
        int pivot = FindPeakIndexInDuplicateRotatedArray(arr);

        if(pivot == -1){
            //It means that the array is not rotated
            System.out.println("0");
        }

        else{
            int ans = pivot + 1;
            System.out.println(ans);
        }
    }

    static int FindPeakIndexInDuplicateRotatedArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid ;
            }

            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            // Here, it is a possibility that arr[mid] == arr[start] == arr[end].... so this case will be different from normal Rotated array search
            else if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // try to skip the middle elements
                // NOTE:- what if the elements at start and end were the pivots

                // check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                // skipped duplicate if it is not the pivot
                start++;

                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                // Or else skip the end
                end--;
            }

            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
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
