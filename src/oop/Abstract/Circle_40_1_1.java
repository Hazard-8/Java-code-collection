package oop.Abstract;

public class Circle_40_1_1 extends Shape_40_1{

    double radius;

    Circle_40_1_1(double radius){
        this.radius = radius;
    }

    @Override   // This has to be done, else there will be an error msg because Shape_40_1 is an abstract class
    double area(){ // ( must be done )
        return Math.PI*Math.pow(radius,2);
    }



}
