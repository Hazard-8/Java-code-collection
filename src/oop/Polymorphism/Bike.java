package oop.Polymorphism;

public class Bike implements Vehicle {

    @Override
    public void go(){
        System.out.println("You ride the bike.");
    }

}

// OR if it was with class instead of interface

/* public class Bike extends Vehicle{
        @Override
        void go(){
            System.out.println("You ride the bike.);
        }
    }
 */