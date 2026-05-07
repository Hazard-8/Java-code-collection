package controlstatements;

import java.util.Scanner;

public class If_10 {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        boolean isStudent = false;
        boolean isSenior = false;
        double tRate = 9.99;

        System.out.println("Are you a Student: Enter \"(Y/N)\" OR \"(true or false)\"");
        String input1 = scanner.nextLine().toUpperCase();

        System.out.println("Are you a student: Enter \"(Y/N)\" OR \"(true or false)\"");
        String input2 = scanner.nextLine().toUpperCase();

        if (input1.equals("Y") || input1.equals("TRUE")){
            isStudent = true;
        }

        if (input2.equals("Y") || input2.equals("TRUE")){
            isSenior = true;
        }

        if (isStudent && isSenior){
            System.out.println("You get a student discount of 10%");
            System.out.println("You get a senior discount of 20%");
            tRate *= 0.7;
            System.out.printf("The price of the ticket is %.2f", tRate);
            System.exit(0);
        }

        if (isSenior){
            System.out.println("You get a senior discount of 20%");
            tRate *= 0.8;
        }
        if (isStudent){
            System.out.println("You get a student discount of 10%");
            tRate *= 0.9;
        }

        System.out.printf("The price of the ticket is %.2f", tRate);

/* nested if statement
        if(isStudent){
            if(isSenior){
             System.out.println("You get a senior discount of 20%");
             System.out.println("You get a student discount of 10%");
             price *= 0.7;
            }
            else{
             System.out.println("You get a student discount of 10%");
             price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System. out.println("You get a senior discount of 20%");
                price *= 0.8;
             }
             else{
                price *= 1;
             }
        }
 */

    }
}
