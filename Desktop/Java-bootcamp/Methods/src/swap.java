public class swap {

    //SWAPPING DOESN'T CHANGE THE VALUE OF ACTUAL PARAMETERS EXAMPLE:

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);


        String name = "Gagan Chauhan";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Gajender Chauhan";  // Creating a new object not modifying it ... STRINGS CAN'T BE MODIFIED(IMMUTABLE)!!
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
