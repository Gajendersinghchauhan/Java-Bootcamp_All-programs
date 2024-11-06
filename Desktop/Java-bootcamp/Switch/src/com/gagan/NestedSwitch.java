package com.gagan;
import java.util.Scanner;

class NestedSwitch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int EmpID = sc.nextInt();
        String Department = sc.next();

        //NORMAL NESTED SWITCH
//        switch(EmpID){
//            case 1:
//                System.out.println("Gagan Chauhan");
//                break;
//            case 2:
//                System.out.println("Bhumi Chauhan");
//                break;
//            case 3:
//                System.out.println("Employee no 3");
//                switch(Department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "CS":
//                        System.out.println("CS Department");
//                        break;
//                    default:
//                        System.out.println("None Department");
//                }
//                break;
//            default:
//                System.out.println("Enter valid employee ID");
//        }


        //ENHANCED NESTED SWITCH
//        switch (EmpID) {
//            case 1 -> System.out.println("Gagan Chauhan");
//            case 2 -> System.out.println("Bhumi Chauhan");
//            case 3 -> {
//                System.out.println("Employee no 3");
//                switch (Department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "CS":
//                        System.out.println("CS Department");
//                        break;
//                    default:
//                        System.out.println("None Department");
//                }
//            }
//            default -> System.out.println("Enter valid employee ID");
//        }
    }
}