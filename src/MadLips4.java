import java.util.Scanner;

public class MadLips4 {
    public static void main(String[]args){

        // MAD LIPS GAME
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        System.out.print("\nEnter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 + " Zoo.");
        System.out.println("In an exhibit , I saw a " + noun1 + ".");
        System.out.println(noun1 +" was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

    }
}
