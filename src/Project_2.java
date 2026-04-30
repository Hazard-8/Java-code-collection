import java.util.Random;
import java.util.Scanner;

public class Project_2 {

    static Scanner scanner = new Scanner(System.in); // Always remember to close scanner
    static Random random = new Random();

    public static void main(String [] args){

        // JAVA DICE ROLLER PROGRAM

        // DECLARE VARIABLE
        int NumOfDice = 0;
        int total = 0;

        // GET # OF DICE FROM THE USERS
        // CHECK IF # DICE > 0
        NumOfDice = Check_Dice(NumOfDice); // Just for fun I created a method,
                                           // Actually it was not needed.

        // ROLL ALL THE DICE
        for(int i = 0; i < NumOfDice; i++ ){
            int Roll;
            Roll = random.nextInt(1,7);
            System.out.println("\nYou Rolled : "+ Roll );
            PrintDice(Roll);
            total += Roll;
        }

        // GET THE TOTAL
        System.out.println("Total = "+total);

        // DISPLAY ASCII OF DICE
                // It is called inside the for loop of roll all the dice


        scanner.close();
    }

    static int Check_Dice(int num){
        do{
            System.out.print("Enter the # of dice to roll: ");
            num = scanner.nextInt();
            if(num<1){
                System.out.println("The number of dice should be greater than \"0\"");
                System.out.print("Enter the # of dice to roll: ");
                num = scanner.nextInt();
            }
        }
        while(num < 1);
        return num;
    }

    static void PrintDice(int roll){
        String dice1 = """
                       ---------
                      |         |
                      |    ●    |
                      |         |
                       ---------
                      """;

        String dice2 = """
                       ---------
                      | ●       |
                      |         |
                      |       ● |
                       ---------
                      """;

        String dice3 = """
                       ---------
                      | ●       |
                      |    ●    |
                      |       ● |
                       ---------
                      """;

        String dice4 = """
                       ---------
                      | ●     ● |
                      |         |
                      | ●     ● |
                       ---------
                      """;

        String dice5 = """
                       ---------
                      | ●     ● |
                      |    ●    |
                      | ●     ● |
                       ---------
                      """;

        String dice6 = """
                       ---------
                      | ●     ● |
                      | ●     ● |
                      | ●     ● |
                       ---------
                      """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }

    }

}
