package arrays;

import java.util.Scanner;

public class arraySearch_25 {

    static Scanner scanner = new Scanner(System.in); //Global

    public static void main(String[]args){

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        boolean isFound = false;

        System.out.print("Enter the name of fruit you want to search: ");
        String target = scanner.nextLine().trim().toLowerCase();

        for(int i = 0; i < fruits.length; i++){
           if(target.equals(fruits[i])){
               // target == fruits[i]; won't work because, In string that compares memory address
               System.out.printf("Targeted fruit(%s) found at index %d\n",fruits[i], i);
               isFound = true;
               break;
           }
        }
        if(!isFound){
            System.out.println("Element not found inside array.");
        }


        String back = i();
        System.out.println(back);


        search(); // Unnecessarily implementing what I have learn (Method)


        String msg = """
                As long as the program is not being interrupted inside the method,
                it will still continue.""";
        System.out.printf("\n%s",msg);

        scanner.close(); // Even if Scanner is declared as global variable,
                         // it still needs to be closed after the use.

    }
    static String i(){

        return "This is nuts";

    }
    static void search(){

        int[] numbers = {3, 6, 2, 6, 9, 10, 23};//int[]num = new int[5]; -> Declaring empty array of number
        boolean x = true;

        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        for(int i = 0; i < numbers.length; i++ ){ // for(int number : numbers){}
            if(target == numbers[i]){
                System.out.printf("Element %d found inside array at index %d.\n",numbers[i], i);
                x = false;
                break; // if we found the target break out of the loop
            }
        }

        if(x){
            System.out.println("Element not fount inside array.");
        }

    }
}