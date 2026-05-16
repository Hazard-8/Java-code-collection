package oop.Abstract;

public class Abstract_40 {
    public static void main(String [] args){

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract class can't be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrate' methods (which are inherited)

        // Shape_40_1 shape = new Shape_40_1(); // This won't work because it's abstract

        Circle_40_1_1 circle = new Circle_40_1_1(6);
        Triangle_40_1_2 triangle = new Triangle_40_1_2(3, 5);
        Rectangle_40_1_3 rectangle = new Rectangle_40_1_3(5, 5);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.printf("\n%.2f \n",circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}
