package controlStatements;

import java.util.Scanner;
public class If_statement6 {
    public If_statement6() {
    }

    public static void main(String[]args){

        // if statement = performs a block of code if its condition is true
        // order matter in the statements

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student: ");
        isStudent = scanner.nextBoolean();

        // Group 1
        if (name.isEmpty() ){ // instead of (name == "") , name.isEmpty() is better
            System.out.println("You didn't enter your name! 😢");
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        else{
            System.out.println("Hello "+ name+"!");
        }

        // Group 2
        if (age >= 65) {
            System.out.println("You are a senior!");
        }
        else if (age >= 18) {
            System.out.println("Your are an adult!");
        }
        else if (age < 0) {
            System.out.println("You are not born yet!");
        }
        else if (age == 0){
            System.out.println("you are a baby!");
        }
        else{
            System.out.println("You are a minor!");
        }

        // Group 3

        if(isStudent){
            System.out.println("You are a student. ");
        }
        else{
            System.out.println("You are not a student. ");
        }

        scanner.close();
    }
}
