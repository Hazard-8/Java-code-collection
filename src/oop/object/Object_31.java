package oop.object;

public class Object_31 {
    public static void main(String [] args){

        // Object can represent real world entity, that can have things(attribute)
        // and do things (methods),
        // we store the data for an object in a location known as heap

        // Eg:- Some attribute a person may have (String name, int age,
        //      double height, double weight)
        //      and methods would be (eat(), sleep())

        // Object = An entity that holds data (attribute)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car_31_1 car = new Car_31_1();

        System.out.print(car.make+" "); // . is known as dot operator,
        //   It allows you to access thing within an object
        System.out.println(car.model);

        //car.is_running = true; // we can modify and change attribute in class
        System.out.println(car.is_running);

        car.start();
        System.out.println(car.is_running);

        car.stop();
        System.out.println(car.is_running);

        car.drive();


    }
}
