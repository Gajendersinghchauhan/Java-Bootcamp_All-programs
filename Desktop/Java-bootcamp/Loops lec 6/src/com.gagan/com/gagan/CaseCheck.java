package com.gagan;

import java.util.*;

public class CaseCheck{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }


//        System.out.println(ch);


//        String word = "hello";
//        System.out.println(word.charAt(3));
    }
}