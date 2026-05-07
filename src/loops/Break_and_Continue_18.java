package loops;

public class Break_and_Continue_18 {
    public static void main (String [] args){

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++){
            System.out.print(i + " "); // This is how it will run without interference
        }

        System.out.println("\n");

        for(int i = 0; i < 10; i++){
            if( i == 5){
                System.out.println("\nHere is the demonstration of (break) keyword");
                System.out.println("Since the break is used, the loop exits");
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 0; i < 10; i++) {
            if(i == 7){
                continue;
            }
            if(i == 9){
                System.out.print(i);
            System.out.println("\nHere is the demonstration of (continue) keyword");
            System.out.println("If you notice here the number '7' is " +
                    "skipped and continues as normal");
            System.out.println("Basically it skips one iteration\n");
            continue;
            }
            System.out.print(i + " ");
        }
        for(int i = 0; i < 10; i++){
            if ( i == 7){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nThe way before this one was actually little more complicated");

    }
}
