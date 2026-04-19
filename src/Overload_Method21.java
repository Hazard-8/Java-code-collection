public class Overload_Method21 {
    public static void main(String[] args){

        // overload method = methods that share the same name,
        //                   but different in parameters
        //                   signature = name + parameters

        // If there are two or method with same name,
        // It will end-up using the method with matching parameters

        String pizza;
        pizza = BakePizza("Pineapple");
        System.out.println(pizza);

        pizza = BakePizza("fat Bread" , "mozzarella", "pepperoni");
        System.out.println(pizza );

    }
    static String BakePizza(String bread){
        return bread + " pizza";
    }

    static String BakePizza(String bread, String cheese){
        return cheese + " " + bread + "pizza";
    }

    static String BakePizza(String bread, String cheese, String topping){
        return topping + " " +  cheese + " " + bread + " pizza";
    }
}