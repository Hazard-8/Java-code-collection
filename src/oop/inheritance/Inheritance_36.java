package oop.inheritance;

public class Inheritance_36 {
    public static void main(String[]args){

        // Inheritance = One class inherits the attribute and methods
        //               from another class
        //               Child <- Parent <- Grandpatent

        Dog_36_1_1_2 dog = new Dog_36_1_1_2();
        Cat_36_1_1_1 cat = new Cat_36_1_1_1();
        Plant_36_1_2 plant = new Plant_36_1_2();

        dog.eat();
        cat.eat();
        System.out.println();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        System.out.println();

        dog.speak();
        cat.speak();

        System.out.println();

        plant.photosynthesis();
        System.out.println(plant.isAlive);// is from organism class
    }
}
