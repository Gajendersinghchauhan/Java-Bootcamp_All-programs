package com.gagan;
import java.util.Scanner;

public class InttoRoman{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer less than or equals to 3999 you want to convert into ROMAN");
        int n = input.nextInt();

        System.out.println("The ROMAN representation is as follows: ");

        while(n>=1000){
            System.out.print("M");
            n = n - 1000;
        }

        int n1 = n;
        if(n1 >= 900 && n1 < 1000){
            System.out.print("CM");
            n1 = n1 - 900;
        }

        int n2 = n1;
        if(n2>=500){
            System.out.print("D");
            n2 = n2-500;
        }

        int n3 = n2;
        if(n3 >= 400 && n3<500){
            System.out.print("CD");
            n3 = n3 - 400;
        }

        int n4 = n3;
        while(n4>=100){
            System.out.print("C");
            n4 = n4 - 100;
        }

        int n5 = n4;
        if(n5 >= 90 && n5 < 100){
            System.out.print("XC");
            n5 = n5 - 90;
        }

        int n6 = n5;
        if(n6>=50){
            System.out.print("L");
            n6 = n6-50;
        }

        int n7 = n6;
        if(n7 >= 40 && n7<50){
            System.out.print("XL");
            n7 = n7 -40;
        }

        int n8 = n7;
        while(n8>=10){
            System.out.print("X");
            n8 = n8 - 10;
        }

        int n9 = n8;
        if(n9==9){
            System.out.print("IX");
            n9 = n9-9;
        }

        int n10 = n9;
        if(n10>=5){
            System.out.print("V");
            n10 = n10-5;
        }

        int n11 = n10;
        if(n11==4){
            System.out.print("IV");
            n11 = n11-4;
        }

        int n12=n11;
        while(n12>0){
            System.out.print("I");
            n12 = n12 - 1;
        }

        // UPDATION REQ I.E. 900,400,90,40  entries......

    }
}