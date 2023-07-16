/**
 * Donnell Perkins
 * Due Date: 07/09/2023
 * 
 * Module 10 - Paper on Lambda Expressions 
 * 
 * This is an example of lambda expression used
 * in previous assignment for this class. 
 */

import java.util.ArrayList;

public class Module9example {
  public static void main(String[] args) {
      // Add the companies to a list 
      ArrayList <String> companies = new ArrayList<String>();
      // Autoboxing
      companies.add("Apple Inc. made USD $394.3 Billion");
      companies.add("JPMorgan Chase made USD $368 Billion");
      companies.add("Berkshire Hathaway made USD $717.38 Billion");
      companies.add("Microsoft Corporation made USD $2.050 Trillion");

      // Display each company that was created using Lambda Expression.
      System.out.println("---------- Lamda Expression ----------");
      companies.forEach((n) -> System.out.println(n + "\n----------------------------"));

      System.out.println("---------- For Loop ----------");
      // Display each company that was created using For Loop.
      for (int i =0; i < companies.size(); i++)
        System.out.println(companies.get(i) + "\n----------------------------");
    }
}

