package oop.GettersAndSetters;

public class GettersAndSetters_44 {
    public static void main(String[]args){

        // They help protect object data and add rules for accessing and modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Charger", "Yellow", 10000);
        //car.model = "Corvette"; // Doing this would make the change directly,
                                  // If you don't want that, use private - model
        // The issue is we cannot normally access private outside its own class directly
        // To access private outside the class, we use Getters and Setters
        // Basically its done by creating another methods inside the class with the get and set, before model name

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

     // car.setModel(); // This won't work because we set the model to final
        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

    }
}
