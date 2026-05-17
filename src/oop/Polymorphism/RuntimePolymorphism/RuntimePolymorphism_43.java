package oop.Polymorphism.RuntimePolymorphism;

import java.util.Scanner;

public class RuntimePolymorphism_43 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        // Runtime polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object.

        // Runtime polymorphism also known as (Dynamic Polymorphism)

        // In this program a user is going to pick a pet either a new Dog() or new Cat(),
        // But that's goint to be determinied in the runtime, after the program is already running.

        // Before the program is running we know that we are going to use speak(), But not sure which one.

        // Animal animal = new Animal(); // Cannot do this, because it is abstract

        Animal animal;
        int choice;

        System.out.print("Enter your choice for choosing pet (1 = Dog, 2 = Cat): ");
        choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            System.out.println("Invalid choice of pet.");
        }

    }
}
