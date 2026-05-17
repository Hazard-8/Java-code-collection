package oop.GettersAndSetters;

public class Car {

    private final String model; // final for additional security
    private String color;
    private int price;


    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // GETTERS
    /* String getModel(String model){  // Getter method cannot take parameters, so that will return error
        return this.model;
    }
*/
    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    String getPrice(){
        return "$" + this.price;
    }

    // SETTERS
    /* Using the Setters, we use void, so no need to specify the datatype

     */

/*    void setModel(String model){ // This won't work because the datatype is set to be final
        this.model = model;
    }
 */

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be less than 0");
        } else {
            this.price = price;
        }
    }

}
