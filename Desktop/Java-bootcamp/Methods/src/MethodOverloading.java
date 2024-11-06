public class MethodOverloading {
    public static void main(String[] args) {
        fun(34);
        fun("Gagan");

        int ans1 = sum(23, 45); // running first sum method
        int ans2 = sum(23,45,12);  // running second sum function
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a,int b, int c){
        return a+b+c;
    }



    static void fun(int a){
        System.out.println("first one...");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("second one...");
        System.out.println(name);
    }
}
