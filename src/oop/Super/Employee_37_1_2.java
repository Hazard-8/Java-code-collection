package oop.Super;

public class Employee_37_1_2 extends Person_37_1 {
    int salary;

    Employee_37_1_2(String first, String last, int salary){
        super(first,last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(first+"'s salary is "+ salary);
    }

}
