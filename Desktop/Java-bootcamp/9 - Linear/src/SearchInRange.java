public class SearchInRange {

    public static void main(String[] args) {
        int[] arr={23,4,6,22,45,24,455,23};
        int target = 23;
        System.out.println(linearsearch(arr,target,1,4));

    }

    static int linearsearch(int[] arr, int num, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i =start; i<= end; i++){
            //check element at every index if it is equal to the target element
            if(arr[i] == num){
                return i;
            }
        }

        // if no return statement is hit it means target is not found.. so return -1
        return -1;
    }
}
