import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array declaration in java
//        int rollno1[] = new int[5];
//        //OR
//        int[] rollno2 = {5,2,3,5,2};


        int[] ros; // array declaration ... ros is getting defined in stack
        ros = new int[5]; // initialisation.... stored in heap memory
        System.out.println(ros[1]);

        String[] ros1 = new String[4];
        System.out.println(ros1[0]);

    }
}



























































//Three tier architecture involves an extra layer between client and database level.
//Three tier architecture consist of client communicating with an application layer then it connects to the database layer by maintaining the isolation between end user and database,
//Middle tier are business layer handle task such as data processing, business view and application work flow by maintaining user interface to the database
//Middle tier also act as buffer between the client and database.It also provides an additional layer of security by putting thr limitations on user access.


//ADVANTAGE:-
//It enhances the scalability as each tier can be scaled independently based on specific requirements.
