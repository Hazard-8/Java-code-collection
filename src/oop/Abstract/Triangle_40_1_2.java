package oop.Abstract;

public class Triangle_40_1_2 extends Shape_40_1{

    double base;
    double height;

    Triangle_40_1_2(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }

}
