package com.gagan;
import java.util.*;

class RepeatedDigit{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        double num = in.nextInt();

        System.out.println("Enter the digit");
        int dig = in.nextInt();

        int count = 0;
        while(num!=0){
            double sub = num%10;
            if(dig==sub){
                count=count+1;
            }
            num=num/10;
        }

        System.out.println(count);
    }
}