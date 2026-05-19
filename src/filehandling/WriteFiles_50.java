package filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles_50 {
    public static void main(String[]args){

        // How to Write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferWriter = Better performance for large amount of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String testContent = "I like pizza, It's really good!";
        String path1 = "C:\\Users\\abhis\\Desktopp\\poetry.txt";

        String poetry = """
                Roses are Red
                Violets are blue
                BOOTY BOOTY BOOTY
                Rockin' EVERYWHERE!
                """;

        int choice = 1;

        switch(choice) {
            case 1:
                try(FileWriter write1 = new FileWriter(path1)){
                    write1.write(poetry);

                }
                catch(FileNotFoundException e) {
                    System.out.println("Could not locate file location1");
                }
                catch (IOException e) { // Safety net
                    System.out.println("Could not write file");
                }
                finally{
                    System.out.println("This will always execute.");
                }
                break; // This is necessary, else it will continue to execute case 2
            case 2:

                for(int i = 0; i < 13; i++) {
                    // while(true){ // This is bad
                    //  for(int i = 0; ; i++){
                    String c = Integer.toString(i); // My experiment
                    String path  = "test" + c + ".txt";
                    String desktop = ("C:\\Users\\abhis\\Desktoppp\\"+path); // wrong path
                    String exp = ("E:\\exp\\"+path);
                    try (FileWriter writer = new FileWriter(exp)) { // This is try with resource
                        // Since we haven't specified a path, our test.txt is probably going to be saved inside src folder
                        // you can also specify absolute location instead of "test.txt",
                        // like (C:\Users\abhis\Desktop\"test.txt"), but use \\ instead of single \
                        // ("C:\\Users\\abhis\\Desktop\\test.txt")
                        // The exception could occur if I misspelled the file path
                        // -> Because Java interprets \ as an escape sequence
                        writer.write(testContent);  // This should be the standard practice
                        System.out.println("File has been written"); // This won't execute if there is an error above
                    } catch (FileNotFoundException e) {
                        System.out.println("Could not locate file location");
                    } catch (IOException e) { // Safety net
                        System.out.println("Could not write file");
                    }
                }
                    //}
                break;

            default:
                System.out.println("Something went wrong!");
        }


    }
}
