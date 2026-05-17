package oop.Polymorphism;

public class Polymorphism_42 {
    public static void main(String [] args){

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                object can identify as other objects.
        //                object can be treated as object of a common superclass.
        //For example:- A dog can identify as a dog, animal, organism and object (it can identify as more than one thing)

        // Polymorphism can be done using class or interface

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();     // Each of these object have a go() method.
                                    // We are goint to place it inside an array and what should be the data type be?
        // For now, we are going to crate an array of Car[] object and place all three car, bike and boat inside it,
        // Car[] car = {car, bike, boat};
        // But it won't work, car doesn't have the shape of bike and boat, same vice versa.
        // so we can create an array of Vehicle[] and place all three objects inside that.

        Vehicle[] vehicles = {car, bike, boat};

        for( Vehicle vehicle : vehicles ){
            vehicle.go();
        }

    }
}
