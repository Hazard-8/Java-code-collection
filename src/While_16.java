import java.util.Scanner;
import java.util.Random;

public class While_16 {
    public static void main (String [] args){
        // While loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String name, response;
        int num, count = 0;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        while (name.isEmpty()){
            System.out.println("Enter your age: ");
            name = scanner.nextLine();
        }
        System.out.println("Hii "+ name);

        System.out.println("Game\nEnter \"Q\" to quit.");
        response = scanner.next().toUpperCase();

        while (!response.equals("Q")){
            System.out.println("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        // do while loop performs the do part at least once and then checks the while part

        do{
            System.out.print("Enter a number between 1 - 10: ");
            num = scanner.nextInt();
            count += 1;
            if (count == 5){
                System.out.println("Are you fucking dumb, can't you read");
            }
            else if (count == 6) {
            System.out.println("You dumb bastard, Enter some number between 1 - 10");
            }
            else if (count >= 10) {
                System.out.println("Since you are retarded, I will enter some number myself: ");
                num = random.nextInt(1, 11);
                System.out.println("The number i Have picked since you are retarded is :"+ num);
                System.exit(0);
            }
        }

        while (num < 1 || num > 10);

        System.out.println("You picked "+ num);

        scanner.close();

    }
}
