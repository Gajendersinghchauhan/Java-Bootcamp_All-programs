import java.util.Scanner;

public class sum {

    /*
    METHOD SYNTAX

    access_modifier return_type name(arguments){
       //body
    }
     */



    public static void main(String[] args) {
        //Q. Input two number and print their sum

//        sum();

//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20,40);
        System.out.println(ans);


    }

    // sum with void as return type
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

    //function that returns a value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    //pass the value of numbers when you are calling the function
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}