import java.util.Arrays;

public class ActuallyChange_or_Swap {
    public static void main(String[] args) {
        //Create an array

        int arr[] = {1,3,56,22,3};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[0] = 5; // modifying the same object that's why the actual value is changing...
    }
}
