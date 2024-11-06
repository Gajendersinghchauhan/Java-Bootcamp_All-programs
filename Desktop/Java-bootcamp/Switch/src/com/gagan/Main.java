package com.gagan;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        //ONE WAY
//        if(fruit.equals("Mango")){
//            System.out.println("Kind of fruits");
//        }
//        if(fruit.equals("Apple")){
//            System.out.println("Keeps doctors away");


        //OTHER WAY
//        switch(fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("Keeps doctors away");
//                break;
//            case "Pineapple":
//                System.out.println("Makes it sweet");
//                break;
//            case "Grapes":
//                System.out.println("Like balls");
//                break;
//            case "Orange":
//                System.out.println("Sour in taste");
//                break;
//            default:
//                System.out.println("Enter a valid fruit");
//        }


        //ENHANCED SWITCH USED IN ADVANCE JAVA
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Keeps doctors away");
//            case "Pineapple" -> System.out.println("Makes it sweet");
//            case "Grapes" -> System.out.println("Like balls");
//            case "Orange" -> System.out.println("Sour in taste");
//            default -> System.out.println("Enter a valid fruit");
//        }

          int day = in.nextInt();
//
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        //WITHOUT BREAK
//        switch(day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;
//        }


         //ABOVE PROGRAM USING ENHANCED SWITCH
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
//            case 6, 7 -> System.out.println("Weekends");
//        }


    }
}