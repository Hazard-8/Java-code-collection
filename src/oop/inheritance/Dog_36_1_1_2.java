package oop.inheritance;

public class Dog_36_1_1_2 extends Animal_36_1_1 {
// Now the dog class has all the attribute and methods in Animal class
    // it is possible by adding the 'extends' keyword after the child class name and adding
    // patent class name after the 'extends' keyword.

    // Even though if the dog class seems empty it have all the attributes and methods
    // from the Animal class

    int lives = 1;

    void speak(){
        System.out.println("The dog goes *woof* ");
    }

}
