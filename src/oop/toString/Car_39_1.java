package oop.toString;

public class Car_39_1 {

    String make;
    String model;
    int year;
    String color;

    Car_39_1(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

// We promise to return the data type of String
    @Override
    public String toString(){
        // I think now, instead of returning hash code we modified it to return something useful
        // whatever we would return will be shown when we print using the reference datatype (when creating an object)
        return this.make + " " + this.model+ " " + this.year+ " " + this.color;
    }

   // @Override
    public int toInt(){
        return 4;
    }

}
