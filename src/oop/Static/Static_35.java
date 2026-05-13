package oop.Static;

public class Static_35 {
    public static void main(String [] args){

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend_35_1 friend1 = new Friend_35_1("SpongeBob");
        Friend_35_1 friend2 = new Friend_35_1("Patrick");
        Friend_35_1 friend3 = new Friend_35_1("SquidWard");

        System.out.println(friend1.name);
        System.out.println(friend1.trialNumOfFriends);

        System.out.println(friend2.name);
        System.out.println(friend2.trialNumOfFriends);

        System.out.println(friend3.name);
        System.out.println(friend3.trialNumOfFriends);// Normally you may expect the value to become 3,
        // but it's not and stays 1 for each object because
        // 'trialNumOfFriends' is not static.
        //
        // Every object gets its own separate copy
        // of non-static variables.


        // To store total number of friends and store it with one variable as common for both
        // we could use static

        // While accessing a static variable or static method, it's actually best to do with the class itself
        // rather than any object crated from that class
        // Static attribute belongs to the class
        // What I was saying is instead of                     friend1.NumOfFriends, use Friend_35_1
        System.out.println("Number of friends with static = "+ Friend_35_1.NumOfFriends);

        // Methods can also be static
        Friend_35_1.ShowTotalFriends();

        // Extra info -> the Math class is also a static
        double x = Math.round(4.33); // To see that hover over the Math.
        // and wait then go to the document and right click and go to the source

    }
}
