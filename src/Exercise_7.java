import java.util.Scanner;
import java.util.Random;
public class Exercise_7 {
    public static void main (String [] args){

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess, min = 1, max = 100, attempts = 0, randomNumber;

        randomNumber = random.nextInt(min, max+1);
        System.out.println("NUMBER GUESSING GAME");
        double half = randomNumber/2.0;

        do{
            System.out.printf("Enter a number between %d - %d", min, max);
            System.out.println("\nEnter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if(guess > (randomNumber+half)){
                System.out.println("Too too High");
            }
            else if (guess <  (randomNumber-half)) {
                System.out.println("Too too Low");
            }
            else if (guess > randomNumber) {
                System.out.println("Too High");
            }
            else if (guess < randomNumber) {
                System.out.println("Too Low");
            }
            else {
                System.out.println("You have guessed the correctly ");
                System.out.println("The number is "+ randomNumber);
                System.out.println("The number of attempts = " + attempts);
            }
        }
        while (guess != randomNumber);{
            System.out.println("Finally you have guessed.");
        }


    }
}
