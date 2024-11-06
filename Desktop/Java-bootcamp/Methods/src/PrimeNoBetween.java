import java.util.Scanner;

public class PrimeNoBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the numbers between what prime numbers to be checked");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for(n=num1;n<=num2;n++){
            if(isPrime(n)){
                System.out.println(n);
            }
        }

    }

    static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }

        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
