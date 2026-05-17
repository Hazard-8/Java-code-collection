package oop.Polymorphism;

public class Car implements Vehicle {

    @Override
    public void go() {
        System.out.println("You drive the car.");
    }
}

// OR if it was with class instead of interface

/* public class Car extends Vehicle{
        @Override
        void go(){
            System.out.println("You drive the car.);
        }
    }
 */
