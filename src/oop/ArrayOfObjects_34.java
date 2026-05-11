package oop;

public class ArrayOfObjects_34 {
    public static void main(String[] args){

        // Creating an anonymous object rather than
        // instantiating the object then assigning them to the array

        Car_34_1[] cars = {new Car_34_1("Mustang", "red"),
                new Car_34_1("Charger", "yellow"),
                new Car_34_1("Corvette", "blue")};

        //  Car_34_1 car1 = new Car_34_1("Mustang", "red");
        //  Car_34_1 car2 = new Car_34_1("Charger", "yellow");
        //  Car_34_1 car3 = new Car_34_1("Corvette", "blue");

        //Car_34_1[] cars = {car1, car2, car3};
        //To create empty list of array with specific size
        // Car_34_1[] cars = new Car_34_1[3];

        // What is the data type of each element within the array, car objects = Car_34_1
        // We need nickname for each element within the array -> car
        // Think of : as in, in our array of cars
        // for (every 'Car_34_1' car object ':' in array of 'cars' do the following) {code to execute}
        for(Car_34_1 car: cars){
            car.color = "Black";
        }
        // We can use for loop or enhanced for loop as we want in these case
        for(int i = 0; i < cars.length; i++ ){
            cars[i].drive();
        }

    }
}
