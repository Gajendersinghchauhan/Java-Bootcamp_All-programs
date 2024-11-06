import java.util.Scanner;

public class RankMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");

        int num = sc.nextInt();
        System.out.println("Enter the marks in different subjects");
        for(int i =0; i<num; i++){
            int marks = sc.nextInt();
            checkGrade(marks);
        }

    }

    static void checkGrade(int marks){
        int Grade = marks/10;
        switch(Grade){
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
            case 7:
                System.out.println("Grade B");
                break;
            case 6:
            case 5:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Grade D");
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("FAIL");
                break;

        }
    }
}
