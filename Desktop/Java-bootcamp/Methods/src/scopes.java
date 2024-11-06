public class scopes {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //SCOPE OF VARIABLE
//        System.out.println(num);  //because num is declared outside psvm function in some other function, so cannot be used here without initialising... It is called the scope of variable


        //SCOPE OF BLOCK....
        {
//            int a = 100;   // cannot be re-declared as already declared outside the block in same function
            a = 100;  // can reassign the original ref variable a new value
            int c = 30;
            System.out.println(a); // will print a = 100
        }
        int c = 300; // Any variable that is initialised inside the block can be initialised again in the same method outside that block

//        System.out.println(c);  //cannot use outside the block in same function
        System.out.println(a); // will print a = 100 here also because the value of original ref variable is reassigned in entire function



        //SCOPE OF/IN FOR LOOP.....
        for(int i=0;i<10;i++){
            System.out.println(i);
            int num = 100;
            System.out.println(a); // any variable that is declared within the function even if it is outside the for loop, it can still be used inside for loop
        }
//        System.out.println(i);  // but can not use any variable that is initialised inside a for loop outside of that loop in the same method



    }

    static void random(int marks){
        int num = 99;
        System.out.println(num);

        //SCOPE OF VARIABLE....
//        System.out.println(a); // Cannot be used outside function in which it is initialised... scope of variable
    }
}
