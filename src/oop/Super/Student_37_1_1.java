package oop.Super;

public class Student_37_1_1 extends Person_37_1 {

    double gpa;

/**    Student(String first, String last, double gpa){ // this won't work because Student_37_1_1 extends Person_37_1,
        this.first = first;                            // So we have to call super (parent) class
        this.last = last;
        this.gpa = gpa;
    }
   **/

    Student_37_1_1(String first, String last, double gpa){
        super(first,last); // Think of super as parent class, Person_37_1(first,last)
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(first+"'s gpa = "+gpa );
    }

}
