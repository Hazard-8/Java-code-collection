package projects;

import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor_29 {
    public static void main(String[] args){

        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLE
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";


        do{
            // GET CHOICE FROM THE USER
            System.out.print("Enter your move (rock, paper, scissor): ");
            playerChoice = scanner.nextLine().trim().toLowerCase();
            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissor")){

                System.out.println("Invalid choice.");
                continue;
            }

            // GET RANDOM CHOICE FOR THE COMPUTER
            computerChoice = choices[random.nextInt(3)]; // random.nextInt(3); means(from 0 to 2)
            System.out.print("Computer choice: "+computerChoice+"\n");

            // CHECK WIN CONDITION
            if(computerChoice.equals(playerChoice)){
                System.out.println("It's a tie");
            }
            else if ((playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                    playerChoice.equals("scissor") && computerChoice.equals("paper"))
            {
                System.out.println("You win!");
            }
            else{
                System.out.println("you lose!");
            }

            // ASK TO PLAY AGAIN?
            System.out.println("Do you want to play again: (yes/no)");
            playAgain = scanner.nextLine().toLowerCase().trim();

        }while(playAgain.equals("yes"));

        // GOODBYE MESSAGE
        System.out.println("We hate to see you go.");

        scanner.close();

    }
}
