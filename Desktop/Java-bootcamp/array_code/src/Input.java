import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // This is array of primitives **********
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 3;
        arr[2] = 33;
        arr[3] = 16;
        arr[4] = 55;
        System.out.println(arr[3]);

        //using for loop
//        for(int i =0; i<5;i++){
//            arr[i] = sc.nextInt();
//        }

        //Easy way to print array ------(1)
//        System.out.println(Arrays.toString(arr));


        //for loop to print an array -----(2)
//        for(int i =0; i<5;i++){
//            System.out.println(arr[i]);
//        }

        //ENHANCED FOR LOOP..... FOREACH LOOP ------(3)
//        for(int num: arr){
//            System.out.print(num + " "); // here 'num' represents elsements of array
//        }

//        System.out.println(arr[5]);  // give array index out of bound exception




        // Array of objects *************
        String[] str = new String[4];
        for(int i =0; i < str.length;i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        //modifying the array
        str[2] = "Gagan";
        System.out.println(Arrays.toString(str));

    }
}
