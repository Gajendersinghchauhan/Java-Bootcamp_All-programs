public class Shadowing {
    static int x = 90; // this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);  //will print 90
        int x ;  // shadowed x at line no 2
//        System.out.println(x); /// it will give an error since the variable x is initialised at line 7
        x=40;
        System.out.println(x);  // will print 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
