/**
 * Donnell Perkins
 * Due Date: 06/18/2023
 * 
 * Write a program to create a new file titled data.file, if the file does
 * not exist. Then write to the new file, adding 10 randomly generated
 * numbers, or append 10 randomly generated numbers to a previous file.
 * Each integer is to be separated by a space. Close the file, then reopen
 * the file and read the data from the file and display it. 
 * 
 */
import java.io.*;
import java.util.*;

public class DperkinsM5Program2 {

    public static void main(String[] args) {
        File data_file = new File("data.txt");

        // Write some data to a file
        ReadWriteData.writeData(data_file);
        
        System.out.println("----------------------------------------------");

        // Read the data from the file
        ReadWriteData.readData(data_file);
    }
}

class ReadWriteData {

    public static void writeData(File file){
        PrintWriter pw;

        try {
            pw = new PrintWriter(file);

            System.out.println("\tGenerating 10 Random numbers....");

            // Write 10 numbers to the data file.
            for (int i = 1; i < 11; i++){
                pw.println( (int)(Math.random() * 100) + 1);
            }
            
            // Close the file
            pw.close();
            System.out.println("10 Random numbers saved to file.");
        }
        catch (Exception error) {
            System.out.println(error);
        }
    }

    public static void readData(File file){
        Scanner sc;

        try {
            System.out.println("Reading the file");

            sc = new Scanner(file);

            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        }
        catch(Exception error2){
            System.out.println(error2);
        }
    }
}

















