package com.gagan;
import java.util.*;

public class InfinteCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Continue operation until 'X' or 'x' comes

        while(true){
            System.out.println("Enter the operator");
            char ch = sc.next().trim().charAt(0);

            int ans = 0;

            if(ch == '+' || ch == '*' || ch == '%' || ch == '/' || ch == '-'){
                System.out.println("Enter the numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(ch=='+'){
                    ans = num1+num2;
                }
                if(ch=='-'){
                    ans = num1-num2;
                }
                if(ch=='*'){
                    ans = num1*num2;
                }
                if(ch=='%'){
                    ans = num1 % num2;
                }
                if(ch=='/'){
                    ans = num1/num2;
                }

                System.out.println(ans);

            }
            else if(ch=='X' || ch == 'x'){
                break;
            }

        }
    }
}