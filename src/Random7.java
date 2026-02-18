import java.util.Random;
public class Random7 {
    public static void main(String[]args){
        Random random = new Random();

        int number;
        double price;
        boolean coin;

        /* number = random.nextInt();
        without specifying anything inside()
        it will create unexpected random or large numbers between -ve and +ve
        */

        number = random.nextInt(1,7); // any random num from 1 to 6
        // first number is inclusive and 2nd number is exclusive

        System.out.println(number);

        price = random.nextDouble(1,101);
        System.out.println(price);

        coin = random.nextBoolean();
        if(coin){
            System.out.println("It's Heads, So the boolean is "+coin);
        }
        else{
            System.out.println("it's Tails, So the boolean is "+coin);
        }
    }
}
