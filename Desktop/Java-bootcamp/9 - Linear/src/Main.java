public class Main {

    public static void main(String[] args) {
        int[] arr = {23,32,44,44,6,63,335,3,-233};
        int num = 0;

        if(linearsearch(arr,num) == -1){
            System.out.println("Item does not exist in array");
        }
        else{
            System.out.println("Item found at " + linearsearch(arr,num));
        }

    }

    //search in the array... Return that index on which item is found,if found
    static int linearsearch(int[] arr, int num){
        if(arr.length == 0){
            return -1;
        }

        for(int i =0; i< arr.length; i++){
            //check element at every index if it is equal to the target element
            if(arr[i] == num){
                return i;
            }
        }

        // if no return statement is hit it means target is not found.. so return -1
        return -1;
    }
}