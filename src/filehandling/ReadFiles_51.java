package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles_51 {
    public static void main(String[] args){

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "C:\\Users\\abhis\\Desktop\\Time Table.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            System.out.println("File found in the location\n");
            String line;
            while((line = reader.readLine()) != null){ // if we run out of lines it will return null
                System.out.println(line);
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){ //Safety net
            System.out.println("Something went wrong");
        }

    }
}
