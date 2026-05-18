package advancedConcepts.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling_49 {
    public static void main(String[]args){

        // Exception = An event that interrupts the normal flow of the program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surrounding any dangerous code with try{} block
        //             try{}, catch{}, finally{}

        Scanner scanner = new Scanner(System.in);


        // There is also try {} with resources, it's when you specify things like Scanner scanner .... inside try(*here){}


        try {
            // System.out.println(1 / 0); // This is not mathematically possible to divide 1 by 0, Therefore it generates an ArithmeticException
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }

        catch(ArithmeticException e){ // The catch(){} block is necessary while using try{}
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        catch(InputMismatchException e){  // You can add more than 1 catch{} blocks to catch specific kind of exceptions
            System.out.println("That's not a NUMBER!");
        }
        catch(Exception e){ // To catch all exception,
            // using by this itself isn't good practice,
            // we want to let the user know what exactly went wrong

            // SAFETY NET
            System.out.println("SOMETHING WENT WRONG!");
        }

        finally { // Optional, this will always get executed, usually this is where you clean everything
            scanner.close();
            System.out.println("This will always get executed");
        }


    }
}
