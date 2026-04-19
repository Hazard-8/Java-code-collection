import java.util.Scanner;
public class Exercise_8 {
    public static void main(String [] args){

        // Printing a matrix of rows and columns with users choice

        Scanner scanner = new Scanner(System.in);

        int rows, columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();
        System.out.println();

        System.out.print("Enter the Symbol to create matrix with: ");
        symbol = scanner.next().charAt(0);
        System.out.println();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
