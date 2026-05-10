package oop;

public class Overloaded_Constructor_33 {
    public static void main(String [] args){

        // overloaded constructor = Allows a class to have multiple constructors
        //                          with different parameter lists.
        //                          Enable objects to be initialized in various ways.

        User_33_1 user0 = new User_33_1();
        User_33_1 user1 = new User_33_1("Leona");
        User_33_1 user2 = new User_33_1("Patrick", 20);
        User_33_1 user3 = new User_33_1("George", "Geori@outlook.com");
        User_33_1 user4 = new User_33_1("Sandy", "Sandi@io.com", 25);

        System.out.println(user0.name);
        System.out.println(user0.age);
        System.out.println(user0.email+" \n");

        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user1.email+" \n");

        System.out.println(user2.name);
        System.out.println(user2.age);
        System.out.println(user2.email+" \n");

        System.out.println(user3.name);
        System.out.println(user3.age);
        System.out.println(user3.email+" \n");

        System.out.println(user4.name);
        System.out.println(user4.age);
        System.out.println(user4.email+" \n");

    }
}
