import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number whose factorial to be calculated: ");
        int num = sc.nextInt();
        System.out.println("The factorial of entered number is " + factorial(num));
    }

    static  int factorial(int n) {
        if(n == 0 || n ==1){
            return 1;
        }
        else{
            return (n * factorial(n-1));
        }
    }
}
