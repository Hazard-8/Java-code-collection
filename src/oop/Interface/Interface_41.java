package oop.Interface;

public class Interface_41 {
    public static void main(String [] args){

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementing classes MUST define.
        //             Supports multiple inheritance-like behavior.

        Rabbit_41_1_1 rabbit = new Rabbit_41_1_1();
        Hawk_41_2_1 hawk = new Hawk_41_2_1();
        Fish fish = new Fish();

        //rabbit.hunt(); // It doesn't have that function
        hawk.hunt();
        rabbit.flee();
        fish.flee();
        fish.hunt();

    }
}