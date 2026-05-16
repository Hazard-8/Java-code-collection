package oop.Abstract;

public class Rectangle_40_1_3 extends Shape_40_1{

    double length;
    double width;

    Rectangle_40_1_3(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }

}
