package methods;

public class varargs_26 {
    public static void main(String[] args){

        // (variable arguments)
        // varargs = allows a method to create a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)


        System.out.print("Total = " + add(1, 2, 3, 4, 5, 10));

        System.out.println("\nAverage = "+ average(1, 2, 3, 4, 5, 6, 7));


    }

    static int add(int ... numbers){ // This packs parameters into array

        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        if (numbers.length == 0){
            System.out.println();
        }

        return sum;
    }

    static double average(double ...numbers){
        // Average = mean
        double sum = 0;

        if( numbers.length == 0){
            return 0;               //if there is no args, its basically div nothing by 0

        }
        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }

}
