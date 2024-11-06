package com.gagan;
import java.util.Scanner;

public class LargestIntAfterZero{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int integer = input.nextInt();
        int largest = integer ,x = 1;

        while(x != 0){
            x = input.nextInt();
            if(x >= integer)
                largest = x;
        }

        System.out.println(largest);

    }

}