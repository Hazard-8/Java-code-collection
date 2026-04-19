import java.util.Scanner;

public class Project_1_compound_calc {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        // A = P [ 1 + (r/n) ] ^ nt

        double principal;
        double rate;
        int times_compounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100 ;

        System.out.print("Enter the # of times compounded per year: ");
        times_compounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / times_compounded, times_compounded * years );

        System.out.printf("The amound after %d year is %.2f $ ", years, amount);

        scanner.close();
    }
}
