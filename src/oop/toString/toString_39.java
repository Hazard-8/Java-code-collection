package oop.toString;

public class toString_39 {
    public static void main(String[] args){

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car_39_1 car1 = new Car_39_1("Ford", "Mustang", 2025, "Red");
        Car_39_1 car2 = new Car_39_1("Chevrolet","Corvette", 2026, "Blue" );

        // By default, it will create some hash code, don't know how it works yet
        // public String tostring(){
        //   return getClass() .getName() + "@" + Integer. toHexString(hashCode());

        // System.out.println(car); // without the .toString() method it will print hash code
        // normally if we had to print the information in the class would be
        // System.out.println(car.make + " " + car.model+ " " + car.year+ " " + car.color);

        System.out.println(car1);
        System.out.println(car2);

        // System.out.println(Car_39_1.toInt()); just testing, this won't work
        System.out.println(car1.toInt());
        System.out.println(car2.toInt());
    }
}

