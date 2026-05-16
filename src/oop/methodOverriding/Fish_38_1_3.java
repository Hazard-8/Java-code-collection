package oop.methodOverriding;

public class Fish_38_1_3 extends Animal_38_1{

    @Override    // What it does is, it shows an error or red underline if the method Overriding is not done
    void move(){ // For example: If I type ( moves() ) instead of ( move() ),
        System.out.println("The animal is swimming"); // we are not actually doing method overriding,
    }                                                 // we are initializing another method
}
