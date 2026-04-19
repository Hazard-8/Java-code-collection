import java.util.Scanner;

public class Project_1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){

        // JAVA BANKING PROGRAM FOR BEGINNERS

        // It is good practice to break up the project into smaller steps

        // DECLARE VARIABLES
        double Balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            // DISPLAY MENU
            System.out.println("********************");
            System.out.println("BANKING PROGRAM");
            System.out.println("********************");
            System.out.println("1. show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("********************");

            // GET AND PROCESS USERS CHOICE
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                // showBalance()
                case 1 -> showBalance(Balance);

                // deposit()
                case 2 -> Balance += deposit();

                // withdraw()
                case 3 -> Balance -= withdraw(Balance);

                // Exit MESSAGE
                case 4 -> isRunning = exit();

                default -> System.out.println("\n*** Invalid choice ***\n");
            }
        }
        scanner.close();

    }
    static void showBalance(double Balance){
        System.out.printf("\nYour current Balance: $%.2f\n\n", Balance);
    }

    static double deposit(){
        System.out.print("Enter the amount to be deposited: ");
        double amount = scanner.nextDouble();
        if (amount < 0){
            System.out.println("Amount cannot be negative.");
        }
        else{
            System.out.println("\nDeposit Successful\n");
        }
        return amount;
    }

    static double withdraw(double Balance){
        System.out.print("Enter the amount you want to WITHDRAW: ");
        double amount = scanner.nextDouble();
        if(Balance < amount){
            System.out.println("INSUFFICIENT FUNDS");
            return 0; // IT is necessary to return something
        } else if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else {
            System.out.println("\nWITHDRAW Successful\n");
            return amount;
        }

    }

    static boolean exit(){
        System.out.println("We hate to see you go 🥲");
        return false;
    }
}
