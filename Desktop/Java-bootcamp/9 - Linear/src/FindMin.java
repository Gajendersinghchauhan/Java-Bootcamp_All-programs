public class FindMin {

    public static void main(String[] args) {
        int[] arr={23,4,6,22,45,24,455,23};
        System.out.println(min(arr));

    }

    static int min(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


}
