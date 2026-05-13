package oop.inheritance;

public class Cat_36_1_1_1 extends Animal_36_1_1 {
    // Now the cat class has all the attribute and methods in Animal class
    // it is possible by adding the 'extends' keyword after the child class name and adding
    // patent class name after the 'extends' keyword.

    // Even though if the Cat class seems empty it have all the attributes and methods
    // from the Animal class

    int lives = 9;

    void speak(){
        System.out.println("The cat goes *meow*");
    }

}
