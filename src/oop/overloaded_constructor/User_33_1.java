package oop.overloaded_constructor;

public class User_33_1 {

    String name;
    String email;
    int age;

    User_33_1(String name){
        this.name = name;
        this.age = 0;
        this.email = "not provided";
    }

    User_33_1(String name, int age){
        this.name = name;
        this.age = age;
        this.email = "not provided";
    }

    User_33_1(String name,String email, int age){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    User_33_1(String name,String email){
        this.name = name;
        this.age = 0;
        this.email = email;
    }


    User_33_1(){
        this.name = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }


}
