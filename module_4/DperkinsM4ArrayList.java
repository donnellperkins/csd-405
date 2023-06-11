/**
 * Donnell Perkins
 * Due Date: 06/11/2023
 * 
 * Module 4 - Create a class title DonnellArrayListTest. 
 * Creat a method that will return the max integer in an ArrayList 
 */

import java.util.*;

public class DperkinsM4ArrayList {

    public static void main(String[] args) {
        int resume = 1;
        ArrayList <Integer> intList = new ArrayList <Integer>();

        Scanner input = new Scanner(System.in);
        System.out.print("Please create a list of integers.\n" + 
                        "Enter 0 when you are finished creating the list.\n");
        
        // User creates an array
        while (resume != 0) {
            int add_input = input.nextInt();
            // add the next input into the ArrayList and print the list
            intList.add(add_input);
            System.out.println(intList);

            //Exit While Loop to end the ArrayList
            if (add_input == 0)
            {
                resume = 0;
            }
        }

        // Get the max value of the ArrayList given by the user.
        Integer max_value = DonnellArrayListTest.max(intList);
        if (max_value == 0) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The max value of the list is: " + max_value);
        }
    }
}

class DonnellArrayListTest {

    // Method to return max number in an arrayList
    public static Integer max(ArrayList<Integer> list) {
        Integer largest;
        largest = Collections.max(list);
        return largest;
    }
}