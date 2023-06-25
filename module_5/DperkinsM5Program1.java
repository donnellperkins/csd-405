/**
 * Donnell Perkins
 * Due Date: 06/18/2023
 * 
 * Module 5: Program 1 - Write a program that uses an ArrayList filled
 * with a minimum of 10 Strings. Use a ‘for-each’ loop to print the
 * ArrayList collection. Then ask a user which element they would like
 * to see again. Then, attempt printing the element in a try/catch
 * format which will result in the element being display. If the
 * element value received is invalid, display a message that an
 * Exception has been thrown displaying “Out of Bounds”. 
 * In this program, include the use of Autoboxing/Auto-Unboxing,
 * working with a user String input. 

 * Complie - javac -d . *.java  
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class DperkinsM5Program1 {

    public static void main(String[] args) {
        ArrayList <String> consoles = new ArrayList<String>();
        // Autoboxing
        consoles.add("NES");
        consoles.add("Xbox");
        consoles.add("Nintendo Wii");
        consoles.add("Playstation");
        consoles.add("Nintendo Switch");
        consoles.add("Sega Genesis");
        consoles.add("Atari");
        consoles.add("GameBoy");
        consoles.add("Dreamcast");
        consoles.add("Nintendo 3DS");

        // Print each of the Elements
        // Display as number orderlist 
        int num = 0;
        for (String i : consoles) {
            System.out.println(num + ": " + i);
            num++;
        }

        System.out.println("----------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Which of the console would you like to see again?" +
                            " Please enter a number (0-9)");

        int userInput = input.nextInt();

        // If the user entered a valid element in the arraylist
        // print the elemet.
        // Try to catch any errors from user input
        try {
            // Auto-Unboxing
            String consoleToDisplay = consoles.get(userInput);
            System.out.println("\n\tYou have selected: " + "\033[0;1m" +consoleToDisplay);
                
        } catch (IndexOutOfBoundsException error) {
            System.out.println("\n" + error);
        }
    }
}