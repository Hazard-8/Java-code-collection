package basics;

public class Printf9 {
    public static void main(String[]args){

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

    // [specifier-character]
        System.out.println("[specifier-character]");
        System.out.println(" ");
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
        System.out.printf("Hello your name is %s,\nyou are %d years old and %.3fcm tall.\n", name, age, height);

        //And I just finds out we could continue type the same thing to next line e.g.
        System.out.printf("It was just for example, now "+
                "I am typing to the next line, %s\n", name);


    // .Precision

        System.out.println("\n.Precision\n");

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

       //Normally when we display numbers using %f it shows 6 decimal values, hence precision are used

        System.out.printf("%.1f\n", price1); // when setting the precision,
        // if the point value saved in the variable is not equal it will automatically round the o/p
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.1f\n", price3);

    // %[flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        System.out.println("\n[flags]\n");

        double price4 = 9.99;
        double price5 = 100.15;
        double price6 = -54.01;

        System.out.printf("%+.2f\n", price4); //We can display + or - of a number by adding + after%
        System.out.printf("%+.2f\n", price5);
        System.out.printf("%+.2f\n", price6);

        double price7 = 99999.09;
        double price8 = 100000.05;
        double price9 = -5407007.431;

        System.out.printf("%,+.2f\n", price9);// comma grouping separator adds a "," in every thousand's space
        System.out.printf("%+,.2f\n", price8);
        System.out.printf("%(,+.2f\n", price7);

        System.out.printf("%(+.2f\n", price4); // Adding a single "(" after % encloses -ve numbers in "()"
        System.out.printf("%(+.2f\n", price5);
        System.out.printf("%(+.2f\n", price6);

        System.out.printf("% .2f\n", price4); // Adding a space after % creates -ve if it's negative and space if +ve
        System.out.printf("% .2f\n", price5);
        System.out.printf("% .2f\n", price6);

        // [width]

        System.out.println("\n[flags]\n");

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 4;
        int id2 = 43;
        int id3 = 534;
        int id4 = 3256;

        System.out.printf("%04d\n", id1); // zero padding works by adding 0 and the total length
        System.out.printf("%04d\n", id2); // amount of digits to zero pad
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n\n", id4);

        System.out.printf("%4d\n", id1); // By setting +ve number after % we can right justify the
        System.out.printf("%4d\n", id2); // number and space pad
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n\n", id4);

        System.out.printf("%-4d\n", id1); // By adding -ve number we can left justify and put
        System.out.printf("%-4d\n", id2); // space afterwords
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);



    }
}
