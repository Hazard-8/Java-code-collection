import java.util.Scanner;

public class user_input_into_Array_24 {
    public static void main(String[] args){

        // Setting empty array of space with predefined value
        // we are setting empty array of strings named foods with space for 5 elements
        //String[] foods = new String[5];

        Scanner scanner = new Scanner(System.in);

        int num;
        String [] foods;

        System.out.print("What # of food do you want?: ");
        num = scanner.nextInt();
        scanner.nextLine(); // there is input buffer of \n for int
        foods = new String[num];

        System.out.println();
        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter the food: ");
            foods[i] = scanner.nextLine(); // It's possible to directly assign
        }

        System.out.println();
        for (String food : foods)
            System.out.println(food);

        scanner.close(); // Always remember to close scanner;

    }
}
