import java.util.Arrays;

public class Arrays_23 {
    public static void main(String [] args){

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"banana", "orange", "apple", "coconut"};
        //System.out.println(fruits); // if I tried to print this, It will return the memory address

        //System.out.println(fruits[0]); // This will print the 1st element of the array
                                         // *index starts with 0, and also it have -ve index from the last

        int numOfFruits = fruits.length; // .length; a build in function to find length of array

         for (int i = 0; i < fruits.length; i++ ){ // Using loop we could print all the elements one by one
             System.out.print(fruits[i]+ " ");
         }
        System.out.println();
        // After importing util.Arrays; we could perform operations on array
        Arrays.sort(fruits); // This sorts elements alphabetically and numbers in Accenting orders

        //There is a thing called enhanced for loop,
        // An enhance for loop cycle exactly once for all the elements inside the arrays
        //Basically it's saying
        //                      for every ((Declared variable)  in (array)) { Do this }
                                for           (String fruit      :     fruits){
                                    System.out.println(fruit);
        }

        //There is also a fill method, we call fill all the elements with a value
        Arrays.fill(fruits,"Pineapple");
        for(String fruit : fruits)
            System.out.println(fruit);
        System.out.println("If I didn't use {} for the for loop,    " +
                "it will consider only the 1st line as the part of the for loop.");
    }
}
