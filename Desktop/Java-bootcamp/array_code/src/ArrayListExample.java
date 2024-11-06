import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(10);
//        list.add(233);
//        list.add(23);
//        list.add(55);
//        list.add(10);
//        list.add(233);
//        list.add(23);
//        list.add(55);
//        list.add(10);
//        list.add(233);
//        list.add(23);
//        list.add(55);
//
//        System.out.println(list.contains(23));
//        System.out.println(list);
//
//        list.set(0,97);
//        list.remove(1);
//        System.out.println(list);


        //input
        for(int i =0;i<5;i++){
            list.add(sc.nextInt());
        }

        for(int i =0;i<5;i++){
            System.out.println(list.get(i));// Here you can not print elements by syntax list[index]...
        }

    }
}
