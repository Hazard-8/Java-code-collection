import java.util.Scanner;
public class Exercise3_1 {
    public static void main(String[] args){

        // printf instead of + use , and the %placeholderTest, and variable

        // Volume = 2 * Math.PI * radius
        // Area = Math.PI * Math.pow(radius, 2)
        // circumference = (4/3)* Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double volume;
        double area;
        double circumference;
        double radius;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        volume = 2 * Math.PI * radius;
        area = Math.PI* Math.pow(radius,2);
        circumference = (4.0/3.0) * Math.PI * Math.pow(radius,2);

        System.out.println();
        System.out.printf("The volume of the sphere is : %.1fcm\n", volume);
        System.out.printf("The Area of the circle is : %.1fcm\n", area );
        System.out.printf("The Circumference of the circle is : %.1fcm\n", circumference);

        scanner.close();
    }
}
