package basics;

import java.util.Scanner;

public class Exercise5 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.nextLine().toUpperCase().trim();

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        // (condition) ? true : false

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("The temperature after conversion = %.2f°%s ", newTemp, unit);

        scanner.close();

    }
}

