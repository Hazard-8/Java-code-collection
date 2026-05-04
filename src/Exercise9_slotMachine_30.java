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
        String[] row = {"🍒", "🍔", "🍉", "⭐", "🍋"};

        // DISPLAY WELCOME MESSAGE
        System.out.println("****************************");
        System.out.println(" ---Welcome to Java Slots---");
        System.out.println("   Symbols: 🍒️ 🍔 🍉 ⭐ 🍋 ");
        System.out.println("****************************\n");

        System.out.println("JAVA Sloat Machine Win and loss explanation (payout)---");
        System.out.println(" JACKPOT = Bet amount * 10 (1000%)");
        System.out.println("    eg:- (🍒️ | 🍒️ | 🍒️) if you bet $100, you will win $1000\n");
        System.out.println(" DOUBLES = bet amount * 2 (200%)");
        System.out.println("    eg:- (⭐ | ⭐ | 🍉) if you bet $100, you will win $200\n");
        System.out.println(" *ₑₗₛₑ you will lose the money.\n");

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
            int x = random.nextInt(5);
            int y = random.nextInt(5);
            int z = random.nextInt(5);

            // PRINT ROW
            System.out.println("Current bet amount: " + bet);
            Thread.sleep(1000);
            System.out.println();
            System.out.println("Starting the Spinning...\n");
            System.out.print(row[x]);
            Thread.sleep(1000);
            System.out.print(" | " + row[y]);
            Thread.sleep(1200);
            System.out.print(" | " + row[z]+"\n\n");

            if(x == y && y == z){
                System.out.println("---JACKPOT---");
                payout = bet*10;
                System.out.println("Payout = $" + payout);
                balance += payout;
            }
            else if (x == y) {
                System.out.println("---DOUBLES---");
                payout = bet*2;
                System.out.println("Payout = $" + payout);
                balance += payout;
            }
            else if (x == z) {
                System.out.println("---DOUBLES---");
                payout = bet*2;
                System.out.println("Payout = $" + payout);
                balance += payout;
            }
            else if (y == z) {
                System.out.println("---DOUBLES---");
                payout = bet*2;
                System.out.println("Payout = $" + payout);
                balance += payout;
            }
            else {
                System.out.println("You lost 😞");
            }

            // GET PAYOUT
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
}
