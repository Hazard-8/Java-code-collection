import java.util.Random;
public class Trial {
    public static void main(String[] args){
        Random random = new Random();

        int num, count = -1;


        //while()
        for(int i = 1; count != 100; i++   ) {
            num = random.nextInt(0, 10);
            count += 1;
            System.out.println(num);
        }
    }
}
