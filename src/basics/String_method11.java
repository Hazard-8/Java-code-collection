package basics;

public class String_method11 {
    public static void main(String [] args){

        String name = "Bro Code";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" "); // returns 1st occurrence of
        int lastIndex = name.lastIndexOf("o"); // returns last occurrence of
        boolean contains = name.contains(" "); // returns true or false, mostly used while checking
        boolean isEquals = name.equals("password");// checks if two things are equal or not

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        name = name.replace("o", "a");

        // name.isEmpty() // Checks the input is empty or not and returns either true or false
        if(!name.isEmpty()){ // just added ! because in this case name is not empty
            System.out.println("Your name is not empty");
            System.out.println("Hello "+ name);
        }
        else{
            System.out.println("Your name is empty");
        }

        System.out.println(lastIndex);

        if(name.contains(" ")){
            System.out.println("Your name contains space");
        }
        else{
            System.out.println("Your name doesn't contain any space");
        }

        String tName = "Hazard";
        String password = "Hazard";

        if (password.equals(tName)){ // This is case-sensitive
            System.out.println("Your password cannot be same as the name.");
        }
        else{
            System.out.println("You can continue");
        }

        if (password.equalsIgnoreCase(tName)){ // This ignores case sensitivity
            System.out.println("Your password cannot be same as the name.");
        }
        else{
            System.out.println("You can continue");
        }

    }
}
