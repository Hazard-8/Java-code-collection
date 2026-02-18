import java.util.Scanner;

public class Exercise1 {
    public static void main(String[]args){

        // Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = height * width;
        System.out.println("The area is "+ area + " cm^2");

        scanner.close();
    }
}
