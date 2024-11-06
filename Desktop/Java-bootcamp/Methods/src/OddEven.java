import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(isOddorEven(num)){
            System.out.println("Entered number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }
    }

    static boolean isOddorEven(int num) {
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
