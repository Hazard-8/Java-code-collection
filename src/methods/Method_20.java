package methods;

public class Method_20 {
    public static void main (String [] args){

        // method = a block of reusable code that is executed when you called ()

        for(int i = 0; i < 3; i++){  happyBirthday("Hazard", 20);}
        // Passing values is known as arguments

        System.out.println(square(5));

        double number = 3;
        double number_x_3 = cube(number);
        System.out.println(number_x_3);

        String first_name = "Bro", last_name = "Code";
        String fullName = fullName(first_name,last_name);
        System.out.println(fullName);

        int age = 18;
        if(age_Check(age)){
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up!");
        }
       int i = age_Check(age) ? 2+2 : 1+1; // this is just for demonstration
        System.out.println(i);

    }
    // method name should be descriptive
    // Matching set to receive a value is known as parameters
     static void happyBirthday(String name, int age){
    System.out.println("Happy Birthday to you!");
    System. out.printf("Happy Birthday dear %s!\n", name);
    System.out.printf("You are %d years old!\n", age);
    System.out.println("Happy Birthday to you!\n");
    } //If we are returning anything
        // it's fine to use void, but if we are returning anything - must declare its data type

    static int square(int ni){
        return (ni * ni);
    }

    static double cube(double num){
        return Math.pow(num, 3);
    }

    static String fullName(String n1, String n2){
        String fname = n1 + " " + n2;
        return fname; // return n1 + " " + n2; also same and BETTER
    }

    static boolean age_Check(int age){
        return (age >= 18);
    }

}
