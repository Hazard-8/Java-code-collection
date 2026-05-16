package oop.Super;

public class Super_37 {
    public static void main(String [] args){

        //                                                        (child class <- parent class)
        // super = Refers to the parent class when using inheritance (subclass <- superclass)
        //         Used in constructor and method overriding
        //         Calls the parent constructor to initialize attributes

        Person_37_1 person = new Person_37_1("Tom", "Holland");
        Student_37_1_1 student = new Student_37_1_1("Richard", "Bard", 3.2);
        Employee_37_1_2 employee = new Employee_37_1_2("Patrick", "james", 80000);

        person.showName();
        student.showGpa();
        employee.showSalary();


    }
}
