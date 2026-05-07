package basics;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.println("CALCULATOR");
        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.println("Enter an operator: (+, -, *, /, %, ^)");
        operator = scanner.next().charAt(0);

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero (0).");
                    validOperator = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '%' -> result = num1 % num2;
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println(operator + " is an Invalid operator.");
                validOperator = false;
            }
        }
        if (validOperator) {
            System.out.printf("%.1f %c %.1f = %.2f ", num1, operator, num2, result);
        }

        scanner.close();
    }
}
