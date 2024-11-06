package com.gagan;
import java.util.Scanner;

public class SPSofIntegers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int integer = input.nextInt();
        int largest = integer ,x = 1;

        int sum = 0;
        int product = 1 ;

        while(integer != 0) {
            int dig = integer % 10;
            sum = sum + dig;
            product = product * dig;
            integer = integer / 10;
        }

        int sub = product - sum;
        System.out.println("The sum of digits of entered integer is: " +sum);
        System.out.println("The product of digits of entered integer is: " +product);
        System.out.println("The difference between product and sum of digits if given integer is: " +sub);

    }

}