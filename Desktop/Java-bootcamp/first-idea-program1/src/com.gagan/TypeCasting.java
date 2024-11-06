package com.gagan;
import java.util.Scanner;

public class TypeCasting{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // *This is type conversion carried out implicitly.**********
        //  float num =input.nextFloat();
        //  float num1 = input.nextInt();
        //  int num2 = input.nextFloat();   WE CAN'T DO THIS...



        // *This is known as type casting where conversion is done explicitly.*
        // int num = (int) 64.75f;

        // System.out.println(num);



        // *Automatic type promotion in expression.**********
        // int a = 257;
        // byte b = (byte) (a); // 257 % 256 = 1 // i.e. byte can store a value up to 256 only.

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // byte d = a*b/c ; THIS WILL NOT BE PERFORMED AS 40*50 = 2000 AND BYTE COULD ONLY STORE UP TO 256.
        // int d = a*b/c; // Here it is automatically converting all byte values to int and then perform.

        // byte e = 50;
        // e = e * 2; It will give an error because every operation performed using byte values it has to get converted into int.

        // System.out.println(e);



        // *------------*********
        // int number = 'A';
        // System.out.println(number); // It will print ASCII value of character in decimal.

        // * Java follows  UNICODE principles********
        // System.out.println("नमस्ते");



        // *In java everything in an operation will be converted to the largest data type present in the expression********
        // byte b = 40;
        // char c = 'c';
        // short s = 242;
        // int i = 10;
        // float f = 23.433f;
        // double d = 234.2224;
        // double result = b*c + (s%i) + (f/d);
        // System.out.println(b*c + " " + (s%i) + " " + (f/d));
        // System.out.println(result);

    }
}