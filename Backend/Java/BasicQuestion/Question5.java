package Backend.Java.BasicQuestion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question5 {
    
    public static void main(String[] args) {
        
        // code to create a new file

        /* 
        File myFile = new File("file.txt");
        try {
        myFile.createNewFile();

        } catch(IOException e) {
            e.printStackTrace();
        }
            */


            // code to write to a file

            /* 
            try {
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write("This is our first file in java\n Okay bye sir");
            fileWriter.close();

            } catch (IOException e) {
                    e.printStackTrace();
            }
            */

            // Reading a file

            File myfile = new File("file.txt");
            try {
                Scanner sc = new Scanner(myfile);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
            } catch(IOException e) {
                e.printStackTrace();
            }

            // Delete a file
             /* 
             File myfile = new File("file.txt");
             if(myfile.delete()) {
                System.out.println("I hava deleted: "+myfile.getName());
             }
             else {
                System.out.println("Some problem occur ");
             }

            */
    }
}
