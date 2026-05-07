package controlstatements;

import java.util.Scanner;

public class Logical_Operator15 {
    public static void main (String [] args){

        // There is two Exercise in this section

        // && = AND
        // || = OR
        // ! = NOT

        Scanner scanner = new Scanner(System.in);
        /**
        double temp = 26;
        boolean isSunny = false;

        if(temp >= 0 && temp <= 30 && isSunny){
            System.out.println("The weather is Good 😊");
            System.out.println("It's sunny outside");
        }
        else if (temp >= 0 && temp <= 30 && !isSunny) {
            System.out.println("The weather is Good 😊");
            System.out.println("It's cloudy outside");
        }
        else if (temp >= 30 || temp <= 0) {
            System.out.println("The weather is bad 😞");
        } **/

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;
        boolean validity = true;

        System.out.println("Enter a username.");
        System.out.println("Validity conditions: \n username must be between 4- 12 characters" +
                "\n username must not contain spaces or underscore.");

        username = scanner.nextLine();

        if (username.length() <= 3 || username.length() >= 13){
            System.out.println("1.Invalid username");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("2.Invalid username");
        } else {
            System.out.println("Welcome "+ username);
        }

        scanner.close();
    }
}
