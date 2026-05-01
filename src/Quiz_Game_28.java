import java.util.Scanner;

public class Quiz_Game_28 {
    public static void main(String[] args){

        // JAVA QUIZ GAME

        Scanner scanner = new Scanner(System.in);

        // QUESTIONS array[]

        String [] questions = {"What is the main function of a router?",
                                "Which part of a computer is considered the brain?",
                                "What year was facebook launched?",
                                "Who is know as the father of the computer?",
                                "What is the first programming language?"};

        // OPTIONS array[][]

        String [][] options =  {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        // DECLARE VARIABLES

        int [] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess = 0;

        // WELCOME MESSAGE

        System.out.println("****************");
        System.out.println("Welcome to Java Quiz Game");
        System.out.println("****************\n");

        // QUESTIONS (loop)
        //      OPTIONS

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]+" ");
            for(int j = 0; j < options[i].length; j++){
                System.out.println(options[i][j]);
            }

            //      GET GUESS FROM THE USER
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();

            //      CHECK OUR GUESS
            if (guess == answers[i]){
                System.out.println("\n********");
                System.out.println("Correct!");
                System.out.println("********\n");
                score++;
            }
            else{
                System.out.println("\n********");
                System.out.println(" Wrong!");
                System.out.println("********\n");
            }
        }

        // DISPLAY FINAL SCORE
        System.out.println("Your final Score is "+ score + " out of "+ questions.length );

        scanner.close();
    }
}
