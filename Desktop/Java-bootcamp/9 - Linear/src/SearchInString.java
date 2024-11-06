import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInString {

    public static void main(String[] args) {
        String name = "Gagan";
        char target = 'a';
        System.out.println(search(name,target));

        System.out.println(Arrays.toString(name.toCharArray())); // It is used to convert string to a character array...
    }

    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }

        //using for each loop
        for(char ch : name.toCharArray()){
            if(ch == target){
                return true;
            }
        }


        //using normal loop
//        for(int i =0; i<name.length(); i++){
//            if(target == name.charAt(i)){
//                return true;
//            }
//        }

        return false;
    }
}
