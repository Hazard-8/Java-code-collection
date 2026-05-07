package controlstatements;

import java.util.Scanner;

public class Switch_14 {
    public static void main (String[]args){

        // Enhanced switch = A replacement to many else if statements
        //                   (Java14 feature)

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.println("Enter the day of the week: ");
        day = scanner.next().trim().toLowerCase();

        switch (day){
            case "monday", "tuesday", "wednesday", "thursday", "friday"
                    -> System.out.println("It is a week day 🥲");

            case "saturday", "sunday" -> System.out.println("It's weekend 😀");

            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }
}
