//This is enhanced method of binary search in which the array can be sorted in either ascending or descending order...It works for bith


public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,14,133};
        int target = 11;

        int ans = orderAsnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAsnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
