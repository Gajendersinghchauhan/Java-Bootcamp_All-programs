import java.util.Scanner;

public class primeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        isPrime(n);

        if(isPrime(n)){
            System.out.println("The number is prime number");
        }
        else{
            System.out.println("The number is not prime number");
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
