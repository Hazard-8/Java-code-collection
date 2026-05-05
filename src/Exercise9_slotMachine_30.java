import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class Exercise9_slotMachine_30 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {


        // JAVA SLOT MACHINE


        // DECLARE VARIABLE
        int balance = 0;
        char letter;
        int bet = 0;
        int payout = 0;
        String[] row;

        // DISPLAY WELCOME MESSAGE
        System.out.println("****************************");
        System.out.println(" ---Welcome to Java Slots---");
        System.out.println("   Symbols: 🍒️ 🍔 🍉 ⭐ 🍋 ");
        System.out.println("****************************\n");


        // PLAY IF BALANCE > 0
        balance = addToBalance();


        // ENTER BET AMOUNT
        //      VERIFY IF BALANCE > BET
        //      VERIFY IF BET > 0
        //      SUBTRACT BET FROM BALANCE
        while(balance > 0){
            System.out.print("Current balance: $"+balance+"\n");
            System.out.print("Place the bet amount: ");
            bet = scanner.nextInt();
            if (bet <= 0){
                System.out.println("Bet must be greater than 0.");
                continue;
            }
            else if (bet > balance) {
                System.out.println("INSUFFICIENT BALANCE.");
                continue; //goes back to the beginning
            }
            else {
                balance -= bet;
            }

            // SPIN ROW
            row = SpinRow();


            // PRINT ROW
            PrintRow(row);


            // GET PAYOUT
            balance += GetPayOut(row, bet);

            System.out.println("Current Balance: $" + balance);

            // ASK TO PLAY AGAIN
            System.out.println("Press \"Q\" to quit.");
            System.out.println("Would you like to play again? (Enter any other key to continue) ");
            letter = scanner.next().toLowerCase().trim().charAt(0);

            // DISPLAY EXIT MESSAGE
            if (letter == 'q') {
                System.out.println("We hate to see you go...");
                break;
            }

        }
        System.out.println("GAME OVER! Your final balance is $" + balance);

        scanner.close();
    }

    static int addToBalance()  {
        int balance = 0;
        int amt = 0;
        while (balance <= 0) {
            System.out.print("Enter the amount you want to deposit: ");
            amt = scanner.nextInt();
            if (amt > 0) {
                balance += amt;
                //System.out.println("Balance = " + balance);
            } else if (amt == 0) {
                System.out.println("\nDeposit amount should be greater than 0\n");
            } else {
                System.out.println("\nDeposit amount cannot be negative\n");
            }
        }
        return balance;
    }

    static String[] SpinRow() {
        String [] symbol = {"🍒", "🍔", "🍉", "⭐", "🍋"};
        String [] row = new String[3];

        for (int i = 0; i <3; i++){
            row[i] = symbol[random.nextInt(symbol.length)];
        }

        return row;
    }

    static void PrintRow(String [] row) throws InterruptedException {
        System.out.println("****************");
        System.out.println(" SPINNING....\n");
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i]);
            Thread.sleep(1000);
            if(i == 2){
                System.out.println("\n****************");
                break; // This is used to not print '|' after the last emoji
            }
            System.out.print(" | ");
        }
        System.out.println();
    }

    static int GetPayOut(String [] row, int bet){

        if ( (row[0].equals(row[1])) && (row[1].equals(row[2])) ){
            System.out.println("---JACKPOT---");
            return switch(row[0]){
                case "🍒" -> bet*3;
                case "🍉" -> bet*4;
                case "🍋" -> bet*5;
                case "🍔" -> bet*10;
                case "⭐" -> bet*20;
                default -> 0;
            }; // This ; is needed because we are using return
        }

        else if( (row[0].equals(row[1])) || (row[1].equals(row[2])) || row[0].equals(row[2])) {
            System.out.println("---DOUBLES---");
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🍔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        else{
            System.out.println("you lost...");
            return 0;
        }


    }

}
