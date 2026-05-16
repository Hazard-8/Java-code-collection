package oop.Super;

public class Super {
    public static void main(String [] args){

        //                                                        (child class <- parent class)
        // super = Refers to the parent class when using inheritance (subclass <- superclass)
        //         Used in constructor and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Holland");
        Student student = new Student("Richard", "Bard", 3.2);
        Employee employee = new Employee("Patrick", "james", 80000);

        person.showName();
        student.showGpa();
        employee.showSalary();


    }
}
