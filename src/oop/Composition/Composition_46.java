package oop.Composition;

public class Composition_46 {
    public static void main(String [] args){

        // Composition = Represents a "part-of" relationship between objects.
        //               For example, an Engine is "part of " a Car.
        //               Allows complex objects to be constructed from smaller objects

        Car car = new Car("Corvette", 2025, "V8");
        // The key difference with the composition is that,
        // if we delete our car object that should also delete our engine, because the engine is part of the car
        // *The Engine is only accessed thought Car class

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine); // This will print the hash id because, engine- it is an object
        System.out.println(car.engine.type); // Now we access the type
        car.start();


    }
}
