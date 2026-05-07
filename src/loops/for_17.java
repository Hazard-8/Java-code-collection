package loops;

import java.util.Scanner;
public class for_17 {
    public static void main(String [] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of times
        // for(Initialization ; Condition ; Update){ }

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        System.out.println("Here we go");

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year 🤍");
    }
}
