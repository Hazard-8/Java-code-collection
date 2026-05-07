package loops;

public class Nested_loop_19 {
    public static void main (String [] args){

        // nested loop = A loop inside another loop
        //               Used often with matrices and DS&A

        for(int i = 1; i <= 3; i++ ){
            for(int j = 1; j <= 9; j++){
                System.out.print(j + " ");
                //if(j == 9){System.out.print("\n");}// This is complicated
            }
            System.out.println(); // This is better
        }
    }
}
