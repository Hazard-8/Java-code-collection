package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_48 {
    public static void main(String [] args){

        // ArrayList = A resizable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        // Also include exercise

        ArrayList<Integer> list = new ArrayList<>(); // <> This is a diamond operator, later about this in generics
                                                      // Inside <> insert the wrapper class of the datatype to store in ArrayList.

        list.add(3);    // .add() is used to add elements to the arraylist
        list.add(2);
        list.add(1);

        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Kiwi");
        fruits.add("Watermelon");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Coconut");


        fruits.add(2, "Orange"); // Inserting element between two elements


        fruits.set(1,"Pineapple"); // Replacing element
        System.out.println(fruits);


        // Finding index of specific element using .indexOf() method
        System.out.println("This is finding index "+fruits.indexOf("Coconut"));


        fruits.remove("Grapes"); // Removing an element, By specifying either index or element itself.
        fruits.remove(3);


        Collections.sort(fruits); // Sort's the elements in Arraylist by either numerically or alphabetically
        System.out.println(fruits);


        // Withing ArrayList to get element at a certain index, you can use the .get() method
        System.out.println(fruits.get(3));


        System.out.println(fruits.size()+"\n"); // .size() method to get total size of the ArrayList


        for(String fruit: fruits){
            System.out.println(fruit);
        }
        System.out.println();


        // EXERCISE


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        int num;
        //String food;

        System.out.print("Enter the # of foods you would like: ");
        num = scanner.nextInt();
        System.out.println();

        for(int i = 0; i < num; i++){

            System.out.print("Enter the food #"+ (i+1) +": ");
            //food = scanner.next();   // you can first assign it to String food and then add too
            foods.add(scanner.next()); // This is also possible

        }

        System.out.print("The food you have selected are: ");
        for(String food : foods){
            System.out.print(food + " ");
        }

        scanner.close();
    }
}
