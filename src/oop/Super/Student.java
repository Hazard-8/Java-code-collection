package oop.Super;

public class Student extends Person{

    double gpa;

/**    Student(String first, String last, double gpa){ // this won't work because Student extends Person,
        this.first = first;                            // So we have to call super (parent) class
        this.last = last;
        this.gpa = gpa;
    }
   **/

    Student(String first, String last, double gpa){
        super(first,last); // Think of super as parent class, Person(first,last)
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(first+"'s gpa = "+gpa );
    }

}
