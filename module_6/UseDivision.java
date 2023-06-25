/**
 * Donnell Perkins
 * Due Date: 06/25/2023
 * 
 * Module 7 - Creating and using abstract classes. 
 * 
 * This class file will be used for company division data. 
 */

package module_6p;

import module_6p.*;

import java.util.*;
import java.math.BigInteger;

public class UseDivision {
    public static void main(String[] args) {

        BigInteger[] acct_nums = new BigInteger[4];
        acct_nums[0] = new BigInteger("9067564534455668");
        acct_nums[1] = new BigInteger("24362547184637");
        acct_nums[2] = new BigInteger("809756342735109283");
        acct_nums[3] = new BigInteger("6758394088560392910");
        
        // Creating 4 company instances
        InternationalDivision company1 = new InternationalDivision("Empire Inc.", 
                                            acct_nums[0], "United Kingdom", "English");
        InternationalDivision company2 = new InternationalDivision("Tech Possibilities Co.",
                                            acct_nums[1], "China", "Mandarin");

        DomesticDivision company3 = new DomesticDivision("Catteries United", 
                                            acct_nums[2], "Michigan");

        DomesticDivision company4 = new DomesticDivision("Cool Vibes Inc.",
                                            acct_nums[3], "Oregan");

        // Setting the display information to a variable 
        String comany1_info = company1.display();
        String comany2_info = company2.display();
        String comany3_info = company3.display();
        String comany4_info = company4.display();
        
        // Add the companies to a list 
        ArrayList <String> companies = new ArrayList<String>();
        // Autoboxing
        companies.add(comany1_info);
        companies.add(comany2_info);
        companies.add(comany3_info);
        companies.add(comany4_info);

        // Display each company that was created.
        companies.forEach((n) -> display(n));
    }

    // display company info
    public static void display(String n)
    {
        System.out.println(n);
        System.out.println("--------------------------");
    }
}