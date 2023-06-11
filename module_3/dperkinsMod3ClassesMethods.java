/**
 * Donnell Perkins
 * Due Date: 06/11/2023
 * 
 * Module 3 - Create a class title DonnellInteger. 
 * Also create methods to return true or false if the value is Even, odd, and Prime.
 * And use equals methods to compare integers. 
 */

public class dperkinsMod3ClassesMethods {

    public static void main(String[] args) {
        // Create a new object
        DonnellInteger donnell = new DonnellInteger();

        
        // Print the default value
        System.out.println("The current int value is: " + donnell.getInt());

        // Check to see if the default value is Even
        Boolean first = donnell.isEven();
        System.out.println("Is the current int value Even?: " + first);

        // Check to see if the default value is Odd
        Boolean second = donnell.isOdd();
        System.out.println("Is the current int value Odd?: " + second);

        // Check to see if the default value is a Prime Number
        Boolean third = donnell.isPrime();
        System.out.println("Is the current int value a Prime number?: " + third);

        System.out.println("-------------------------------------");

        // Set the Integer value and see if its Even
        donnell.setInteger(4);
        Integer fourth_integer = donnell.getInteger();
        Boolean fourth = donnell.isEven(fourth_integer);
        if (fourth) {
            System.out.println("The integer is "+ fourth_integer +" and it is Even.");
        } else {
            System.out.println("The integer is "+ fourth_integer +" and it is not Even.");
        }

        // Set the Int value and see if its Even
        donnell.setInt(4);
        int fifth_int = donnell.getInt();
        Boolean fifth = donnell.isEven(fifth_int);
        if (fifth) {
            System.out.println("The int is "+ fifth_int +" and it is Even.");
        } else {
            System.out.println("The int is "+ fifth_int +" and it is not Even.");
        }

        // Set the Int value and see if it is a Prime Number
        donnell.setInt(87);
        int sixth_int = donnell.getInt();
        Boolean sixth_prime = donnell.isPrime(sixth_int);
        Boolean sixth_odd = donnell.isOdd(sixth_int);
        if (sixth_prime) {
            System.out.println("The int is "+ sixth_int +" and it is a Prime Number.");
        } else {
            System.out.println("The int is "+ sixth_int +" and it is not a Prime Number.");
        }
        // Check to see if it is odd
        if (sixth_odd) {
            System.out.println("The int is "+ sixth_int +" and it is Odd.");
        } else {
            System.out.println("The int is "+ sixth_int +" and it is not Odd.");
        }

        // Set the Integer value and see if it is Odd
        donnell.setInteger(28);
        Integer seventh_integer = donnell.getInteger();
        Boolean seventh_odd = donnell.isOdd(seventh_integer);
        Boolean seventh_prime = donnell.isPrime(seventh_integer);
        // Check to see if its odd
        if (seventh_odd) {
            System.out.println("The integer is "+ seventh_integer +" and it is Odd.");
        } else {
            System.out.println("The integer is "+ seventh_integer +" and it is not Odd.");
        }
        // Check to see if it is a prime number
        if (seventh_prime) {
            System.out.println("The integer is "+ seventh_integer +" and it is a Prime Number.");
        } else {
            System.out.println("The integer is "+ seventh_integer +" and it is not a Prime Number.");
        }

        System.out.println("-------------------------------------");

        Integer rand_integer = 28;
        System.out.println("Does Integer 4 = Int 4? ");
        System.out.println(fourth_integer.equals(fifth_int));

        System.out.println("Does Integer 28 = Int 87? ");
        System.out.println(seventh_integer.equals(sixth_int));

        System.out.println("Does Integer 28 = Integer 28? ");
        System.out.println(rand_integer.equals(seventh_integer));
    }
}

class DonnellInteger {
    private int donnell_int = 9;
    private Integer donnell_integer = 1;

    public void setInt(int num) {
        this.donnell_int = num;
    }

    public void setInteger(Integer num) {
        this.donnell_integer = num;
    }

    public  boolean isEven() {
        if (this.donnell_int % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isOdd(){
        if (this.donnell_int % 2 == 0)
            return false;
        else
            return true;
    }

    public boolean isPrime() 
    {
        if (this.donnell_int <= 1)
            return false;

        for (int i = 2; i <= this.donnell_int / 2; i++) {
            if (this.donnell_int % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isOdd(int num) {
        if (num % 2 == 0)
            return false;
        else
            return true;
    }

    public static boolean isPrime(int num)
    {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(Integer num)
    {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isOdd(Integer num) {
        if (num % 2 == 0)
            return false;
        else
            return true;
    }

    public static boolean isPrime(Integer num)
    {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public int getInt() {
        return donnell_int;
    }
    public Integer getInteger() {
        return donnell_integer;
    }
    
}