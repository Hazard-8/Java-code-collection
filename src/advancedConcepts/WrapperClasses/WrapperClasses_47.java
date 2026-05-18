package advancedConcepts.WrapperClasses;

public class WrapperClasses_47 {
    public static void main(String[] args){

        // Wrapper classes = Allows primitive values (int, double, char, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally don't wrap primitives unless you need an object.
        //                   Allows use of collections Framework and static Utility Methods.

        // For reference, we will demonstrate a depreciated method,
        // The modern technique to do this is called Autoboxing

        // int a = 123; // we can treat this primitive as an object by using a wrapper class
        //Integer a = new Integer(123); // This is how to do it
        //Double b = new Double(3.14);
        //Boolean c = new Boolean(true);
        //Character d = new Character('$');


        // Autoboxing  -> The modern way is to just assign it directly.
        //                Turning primitive datatypes into objects

        /*
        Integer a = 123;
        Double b = 3.14;
        Boolean c = true;
        Character d = '$';
        */


        // Unboxing -> Way to turn the Wrapper Classes back into primitive


        //int x = a;
        //double x = b;
        //boolean x = c;
        //char x = d;


        // Converting Wrapper Classes into String datatypes

/*
        String e = a.toString(); // This is only possible because we have saved it as Wrapper class (objects)
        String f = b.toString();
        String g = c.toString();
        String h = d.toString();
*/
        // Else this is how to do it properly
/*
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('$');
        String d = Boolean.toString(false);

        String x = a + b + c + d; // This only possible because we convert it into String using .toString();
        System.out.println(x);
*/


        // Converting String to primitive data type, using parsing


        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);     // char doesn't have a parse method, Instead we could use .charAt();
                                        // But it is unrelated to wrapper classes
        boolean d = Boolean.parseBoolean("true");

        // String x = a + b + c + d; // This won't work because it's all different datatype


        // Checking if it is a character using .isLetter method


        char a1 = 'b';
        char a2 = '$';
        char a3 = 'B';

        System.out.println(Character.isLetter(a1)); // This should return either true or false
        System.out.println(Character.isLetter(a2));


        // Checking if it is upper/lower case letter using .isUpper and .isLower method

        System.out.println(Character.isLowerCase(a1));
        System.out.println(Character.isLowerCase(a2));

        System.out.println(Character.isUpperCase(a3));
        System.out.println(Character.isUpperCase(a2));



    }
}
