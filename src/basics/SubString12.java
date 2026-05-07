package basics;

import java.util.Scanner;

public class SubString12 {
    public static void main (String [] args){

        // .substring() = A method used to extract a portion of a string
        //                .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(!email.contains("@")){
            boolean validation = email.contains("@");
            while(!validation) {
                System.out.println("Email must contain @");
                System.out.println("Enter a valid email: ");
                email = scanner.nextLine();
                validation = email.contains("@");
            }
        }


        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@")+1); // If you enter string index but not ending index
                                                                // It will automatically continue until last index.


        System.out.println(username);
        System.out.println(domain);

        scanner.close();

    }
}
