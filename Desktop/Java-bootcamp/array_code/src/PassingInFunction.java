import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr1 = {62,73,34,23,22};
        System.out.println(Arrays.toString(arr1));
        change(arr1);
        System.out.println(Arrays.toString(arr1));
    }


    //Passing arrays in java....
    static void change(int[] arr){
        arr[0] = 97; // bhumi roll no
    }
}
