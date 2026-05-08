package oop;

public class Car_31_1 {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean is_running = false;

    void start(){           // There is no need of the static keyword in here,
                            // because classes behave like it's for each other
        if(!is_running)
            System.out.println("Currently the engine is not running");

        else
            System.out.println("Currently the engine is running");
        is_running = true;
        System.out.println("Now the engine has started.");
    }

    void stop(){
        if(is_running) {
            System.out.println("The engine was running"); // without {} after if,
            // it will only execute next one line
            is_running = false;
            System.out.println("Now it's stopped");
        }
            else{
            System.out.println("The engine is not running");
        }
    }

    void drive(){
        System.out.println("You drive the "+ model);
    }




}
