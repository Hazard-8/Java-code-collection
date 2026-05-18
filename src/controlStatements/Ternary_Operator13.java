package controlStatements;

public class Ternary_Operator13 {
    public static void main (String [] args){

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;
/*
        if(score >= 60){    // Example
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

 */
        // instead of this if else statement, we could use ternary operator

        String PassOrFail = (score >= 60) ? "Pass" : "Fail" ;
        System.out.println(PassOrFail);

        int number = 3;

        String EvenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(EvenOrOdd);

        int hour = 13;

        String TimeOfDay = (hour > 12) ? "P.M." : "A.M.";
        System.out.println(TimeOfDay);

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}
