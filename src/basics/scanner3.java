package basics;

import java.util.Scanner;

public class scanner3{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in); // when we open something we have to close it

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // .nextLine inputs the entire line until enter
                                          // .next reads the next input until space

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();    // .nextInt() reads next int

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble(); // .nextDouble() reads as double point

        System.out.print("Are you a student (True or False): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Your name is "+ name);
        System.out.println("Your age is "+ age);
        System.out.println("gpa = " +gpa);
        System.out.println("Student = "+ isStudent);

        if (isStudent){
            System.out.println("You are enrolled as a student. ");
        }
        else{
            System.out.println("Your are NOT enrolled as a student: ");
        }
            // COMMON ISSUES
        System.out.print("Enter your age trail: ");
        int age1 = scanner.nextInt();
// while inputting an int or double there would a /n in there and when we also click enter
        //additional /n is added so the right after input reads /n
        //to fix this we can just type scanner.nextLine() without assigning
        scanner.nextLine();
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age1 +" years old");
        System.out.println("Yor like the color "+ color);

        scanner.close(); // Closing the scanner is the standard practice
    }
}