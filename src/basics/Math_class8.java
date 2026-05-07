package basics;

public class Math_class8 {
    public static void main(String[]args){

        System.out.println(Math.PI);
        System.out.println(Math.E); // Exponential constant also known as Euler's constant
                                    // or Euler's number

        double result;
        result = Math.pow(2, 4); // Math.pow() is used to create power i.e 2^4
        result = Math.abs(-5); // absolute makes -ve number to positive, distance to that num to 0
        result = Math.sqrt(9); // square root of the value
        result = Math.round(3.55); // rounds to nearest whole number
        result = Math.ceil(3.14); // rounds up to next whole number
        result = Math.floor(3.88); // rounds down to previous whole number
        result = Math.max(20, 30); // finds max value
        result = Math.min(20, 30); // finds min value

        System.out.println(result);

    }
}
