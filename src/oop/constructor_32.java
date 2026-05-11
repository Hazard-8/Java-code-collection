package oop;

public class constructor_32 {

    public static void main(String [] args){

        // A constructor must have same name as the class
        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Student_32_1 student1 = new Student_32_1("Sponge bob", 21, 3.7);
        //This is called constructing an object
        Student_32_1 student2 = new Student_32_1("Sunny", 20, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled+" \n");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        student2.isStudying();

    }

}
