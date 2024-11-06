// Finding the position of the target element in an infinite array.... It basically means that you can not use "arr.length" function...

public class BinarySearchinInfiniteArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
        int target = 15;

        int start = 0;
        int end = 1;

        int ans = findRange(arr,target,start,end);
        System.out.println(ans);

    }


    //Finding range using RECURSION....
    static int findRange(int[] arr, int target, int start, int end){

        if(target >= start && target <=end){
            return binarySearch(arr,target,start,end);
        }

        return findRange(arr,target,end+1,end+(end-start)*2);

    }



    //Finding the range using loops normally.....
//    static int findRange(int[] arr, int target, int start, int end){
//        while(target > arr[end]){
//            int newStart = end + 1;
//
//            end = end + (end - start) * 2;
//            start = newStart;
//        }
//
//        return binarySearch(arr,target,start,end);
//    }



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

