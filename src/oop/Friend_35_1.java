package oop;

public class Friend_35_1 {

    String name;
    static int NumOfFriends;
    int trialNumOfFriends;

    Friend_35_1(String name){
        this.name = name;
        trialNumOfFriends++;
        NumOfFriends++;
    }

    static void ShowTotalFriends(){
        System.out.println("You have total of "+NumOfFriends + " Friends");
        // System.out.println(this.name); // It won't work because the static belongs to the class
        // and the .this refers to the current object
    }


}
