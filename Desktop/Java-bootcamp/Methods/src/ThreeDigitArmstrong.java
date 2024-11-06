import java.util.Scanner;
// Print all three digit armstrong numbers
public class ThreeDigitArmstrong {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);      // to check a number is armstrong or not entered by user...
//        System.out.println("Enter any number");
//        int num = sc.nextInt();
//        boolean ans = isArmstrong(num);
//        System.out.println(ans);

        for(int num = 100;num<1000;num++) {    // printing armstrong number between 100 to 999....
            if(isArmstrong(num)){
                System.out.println(num);
            }
        }
    }

    static boolean isArmstrong(int num) {
        int originalNumber, remainder, result = 0;

        originalNumber = num;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            return true;
        else
            return false;
    }
}
