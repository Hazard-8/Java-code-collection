package oop;

public class Student_32_1 {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student_32_1(String name, int age, double gpa){

        this.name = name; // this. keyword refers to the object
                          // we are currently constructing or currently working with
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void isStudying(){
        System.out.println(this.name + " is studying");
    }

}
