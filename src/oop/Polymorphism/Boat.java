package oop.Polymorphism;

public class Boat implements Vehicle{

    @Override
    public void go(){
        System.out.println("You sail the boat.");
    }

}

// OR if it was with class instead of interface

/* public class Boat extends Vehicle{
        @Override
        void go(){
            System.out.println("You sail the boat.);
        }
    }
 */
