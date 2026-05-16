package oop.Interface;

public class Fish implements Predator_41_2, Prey_41_1{
    // Now this inherits from 2 classes, but named as interface


    @Override
    public void hunt(){
        System.out.println("*The Fish is hunting*");
    }

    @Override
    public void flee(){
        System.out.println("*The Fish is swimming away*");
    }

}
