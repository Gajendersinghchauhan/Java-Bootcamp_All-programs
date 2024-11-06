import java.util.Scanner;

public class JustDisplay {
    public static void main(String[] args) {
//        display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Give your name: ");
        String name1 = sc.next();
        String reply = greeting(name1);
        System.out.println(reply);
    }

    // string function with actually returning a value
    static String greeting(String name){
        return "Hello " + name + ", How are you?";
    }

    // string function with void return type
    static void display(){
        System.out.println("Hello World");
    }
}
