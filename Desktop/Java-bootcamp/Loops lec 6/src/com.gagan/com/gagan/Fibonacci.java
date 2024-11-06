package com.gagan;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many terms of FIBONACCI Series to be printed");
        int terms = input.nextInt();

        int a = 0 , c = 0 , b = 1;
        for(int i=0; i<terms; i++){
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
        }
    }
}