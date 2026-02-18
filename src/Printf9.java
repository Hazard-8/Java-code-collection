public class Printf9 {
    public static void main(String[]args){

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name); // %s means String,
        // \n is used because printf doesn't have new line character

        System.out.printf("Your name starts with the letter %c\n", firstLetter);
        // %c means character

        System.out.printf("Your are %d years old.\n", age);
        // %d for integer and digits (maybe whole number)

        System.out.printf("you are %.2f tall.\n", height);
        // we could use decimal(.) after % and the
        // number value to specify number of decimal value needed
        // %f for floating point number and doubles

        System.out.printf("Employed  = %b\n", isEmployed);
        // %b for boolean values

        //And we can insert multiple variables within same line
        System.out.printf("Hello your name is %s,\nyou are %d years old and %.3fcm tall.", name, age, height);

        //And I just finds out we could continue type the same thing to next line e.g.
        System.out.printf("It was just for example, now"+
                "I am typing to the next line, %s\n", name);


    }
}
