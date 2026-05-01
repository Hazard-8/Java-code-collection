public class _2D_Arrays_27 {
    public static void main(String[] args){

        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

        // There will also be one Exercise in this (array resembling num pad)

        char [][] telephone =  {{'1', '2', '3'}, // This is for readability
                                {'3', '4', '5'},
                                {'6', '7', '8'},
                                {'*', '9', '#'}};
        numpad(telephone);

        String [] fruits = {"orange", "apple", "banana"};
        String [] vegetables = {"potato", "onion", "carats"};
        String [] meats = {"chicken", "pork", "beef", "fish"};

        String [][] groceries = {fruits, vegetables,
                {"tooth paste", "brush", "deodorant"},
                meats};

        // Altering elements inside 2D array ->
        // We need to specify both indexes of the 2D array
        // 2D_Array [row] [column]
        groceries [2][2] = "\"mouth wash\"";
        groceries [0][1] = "pineapple";

        //This means [array of index 2] [element in index 2 of array of index [2]

        for (int i = 0; i < groceries.length; i++){
            if(i == 1)
                continue; // This means it will skip the array of index 1
            // if (groceries[i] == groceries[1]) continue; // same skipping
            for (int j = 0; j < groceries[i].length; j++ ){
                System.out.print(groceries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("\nSame thing with Enhanced for loop\n");
        System.out.println("--------------------------------------------------");

        for (String [] elements : groceries){
            if (elements == groceries[2]) continue; // skipping in another way of index 2
            for (String element : elements){
                System.out.print(element+ " ");
            }
            System.out.println();
        }

    }

    static void numpad(char[]...telephone){ //char [][] telephone
        System.out.println("Replica of Numpad");
        System.out.println("--------------------------------------------------");
        for (char[] elements : telephone){
            for (char element : elements){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
    }

}
