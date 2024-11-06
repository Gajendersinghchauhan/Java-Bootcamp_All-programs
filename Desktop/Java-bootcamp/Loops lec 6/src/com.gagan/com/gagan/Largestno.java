package com.gagan;
import java.util.Scanner;

public class Largestno{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


        //METHOD 1""""""
//        if(a>b && a>c){
//            System.out.println("Largest number is: "+a);
//        }
//        else if(b>c){
//            System.out.println("Largest number is: "+b);
//        }
//        else{
//            System.out.println("Largest number is: "+c);
//        }


        // OR****************************************************************************

       //METHOD 2""""""
//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//
//        System.out.println(max);

        // OR****************************************************************************

        //METHOD 3"""""
//        int max = Math.max(c,Math.max(a,b));
//        System.out.println(max);

    }
}
