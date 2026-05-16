package oop.methodOverriding;

public class methodOverriding_38 {
    public static void main(String[]args){

        // Method overriding = When a subclass provides its own
        //                     implementation of method that is already defined.
        //                     Allows for code reusability and give specific implementations.

        Dog_38_1_1 dog = new Dog_38_1_1();
        Cat_38_1_2 cat = new Cat_38_1_2();
        Fish_38_1_3 fish = new Fish_38_1_3();

        dog.move();  // All three classes extends from animal class,
        cat.move();  // Method overriding is just changing the property or ,
        fish.move(); // Declares same method name and do something else
                     // Using ( @Overriding ) helps

    }
}
