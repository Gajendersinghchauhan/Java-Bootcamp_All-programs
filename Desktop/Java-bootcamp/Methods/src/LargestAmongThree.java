import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        isLargest(num1, num2,num3);
        isSmallest(num1, num2, num3);

    }

    static void isLargest(int num1, int num2, int num3) {
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1 + " is largest");
            }
            else{
                System.out.println(num3 + " is largest");
            }
        }

        else{
            if(num2>num3){
                System.out.println(num2 + " is largest");
            }
            else{
                System.out.println(num3 + " is largest");
            }
        }
    }

    static void isSmallest(int num1, int num2, int num3) {
        if(num1<num2){
            if(num1<num3){
                System.out.println(num1 + " is largest");
            }
            else{
                System.out.println(num3 + " is largest");
            }
        }

        else{
            if(num2<num3){
                System.out.println(num2 + " is largest");
            }
            else{
                System.out.println(num3 + " is largest");
            }
        }
    }
}
