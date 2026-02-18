public class Variable2 {
    public static void main(String[]args){
        // variable = a reusable container for a value
        // variable behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive  VS  Reference
        // --------       ---------
        // int =32bits    string
        // double =64bits array
        // char =8bits    object
        // boolean

        //Those previous are beginners datatype there is much more,
        //byte = 8bits
        //short = 16bits
        //long = 64bits <- long have to end with l at last, example = 45366626f004l
        //float = 32bits <- have to end with f , example = 62.636636f
        //void

        // 2 steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment


        /* int aged;  This is declaration,
         later it used without specifying data type by assigning
        */
        // int is a whole number
        int age = 21;
        int year = 2026;
        int quantity = 3;

        System.out.println("The year is " + year);

        //double is a number, That can contain decimal
        double price = 19.99;
        double discount = 2.00;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price +" discount = "+ discount);

        //char <- meaning character, which hold a single character
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(symbol);

        //boolean <- either true or false
        boolean is_Student = true;
        boolean forSale = false;
        boolean isOnline = true;

        if(is_Student){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        //String = series of character
        String name = "Abhishek S";
        String food = "pizza";
        String email = "fake123@gmail.com";

        System.out.println("Hello " + name);
        System.out.println(email);
    }
}
