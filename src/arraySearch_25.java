import java.util.Scanner;

public class arraySearch_25 {

    static Scanner scanner = new Scanner(System.in); //Global

    public static void main(String[]args){

        String[] fruits;
        int[] numbers = {3, 6, 2, 6, 9, 10, 23};//int[]num = new int[5]; -> Declare empty array of number

        search(true, numbers); // Unnecessarily implementing what I have learn (Method)

        System.out.println("just for test");
        // As long as the program is not being interrupted inside the method, it will still continue

        scanner.close(); // Even if Scanner is declared as global variable,
                         // it still needs to be closed after the use.

    }
    static void search(boolean x, int[] numbers ){
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        for(int i = 0; i < numbers.length; i++ ){ // for(int number : numbers){}
            if(target == numbers[i]){
                System.out.println("Element "+ numbers[i] +" found inside array.");
                x = false;
            }
        }
        if(x){
            System.out.println("Element not fount inside array.");
        }

    }
}