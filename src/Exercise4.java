import java.util.Scanner;

public class Exercise4 {
    public static void main(String []args){

        // WEIGHT CONVERSION PROGRAM

        //  Let's write in a standard manner---
        // while doing a project it's good to use pseudocode with all your plans

        // Declare and close Scanner

        Scanner scanner = new Scanner(System.in);

        // Declare variable

        double weight;
        double newWeight;
        int choice;

        // Welcome message

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // Prompt for user input

        System.out.println("Enter your choice");
        choice = scanner.nextInt();

        // Option 1 convert lbs to kgs

        if(choice == 1){
            System.out.println("Enter the weight in lbs");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is %.2f ", newWeight);
        }

        // Option 2 convert kgs to lbs

        else if (choice == 2) {
            System.out.println("Enter the weight in kgs");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is %.2f ",newWeight);

        }

        // If not option 1 or 2 ,display invalid choice

        else{
            System.out.println("You entered an invalid choice");
        }

        scanner.close();
    }
}
