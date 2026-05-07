package basics;

public class Arithmetic_Operators5 {
    public static void main(String[]args){
        /** Arithmetic Operators
         *
         */


        int x = 10;
        int y = 3;
        int z;

        z = x + y;
        z = x - y;
        z = x * y;
        z = x / y;
        z = x % y;

        /**
        Augmented Assignment Operators
         */

       // x = x + y;
       // x += y;

       // x = x - y;
       // x -= y;

       // x = x % y;
       // x %= y;

       // x = x / y;
       // x /= y;

       // x = x * y;
       // x *= y;

        /**
         Increment and Decrement Operators
         */

        int a = 1;

        a = a +1;
        a += 1;

        a ++;   //This is used when the operation is increment or decrement is by 1

        a --;  // a = a-1;

        /**
          ORDER OF OPERATIONS [P-E-M/D-A-S] or [B-O-D/M-A-S]
          The M/D, D/M it have same priority not any one before another
          In math, "Order" means powers, square roots, and indices (exponent).
         */

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(x);
        System.out.println(a);
        System.out.println(z);
        System.out.println(result);
    }
}
