public class Overload_Method21 {
    public static void main(String[] args){

        // overload method = methods that share the same name,
        //                   but different in parameters
        //                   signature = name + parameters

        System.out.println(add(5, 6) + 5);
    }
        static int add( int i , int j){
         return i + j;
        }
}