// Variable Length Arguments....

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // calling function with variable length argument
        fun(1,2,4,5,3,5,3,4,3);

        // calling function with multiple arguments along with a variable length argument
        multiple(23,45,"Gagan","Gajender","Bhumi");// can not change the order of arguments !!!! AND variable length always comes at the end...

    }

    static void fun(int ...v) {
         System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b, String ...v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
