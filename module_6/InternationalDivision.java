/**
 * Donnell Perkins
 * Due Date: 06/25/2023
 * 
 * Module 7 - Creating and using abstract classes. 
 * 
 * This class file will be used for company International division data. 
 */

package module_6p;

import module_6p.*;
import java.util.*;
import java.math.BigInteger;

public class InternationalDivision extends Division{
    private String country;
    private String lang;

    public InternationalDivision() {
    }

    public InternationalDivision(String div_name, BigInteger div_acctnum,
                                String div_country, String div_lang) {
        this.country = div_country;
        this.lang = div_lang;

        setName(div_name);
        setAcctNum(div_acctnum);
    }

    // Retrieve the Country
    public String getCountry() {
        return country;
    }

    // Set the Country
    public void setCountry(String div_country) {
        this.country = div_country;
    }

    // Used to retrieve the Language 
    public String getLang() {
        return lang;
    }

    // Set the Language
    public void setLang(String div_lang) {
        this.lang = div_lang;
    }

    // Display the International Data
    public String display() {
        String name = getName();
        BigInteger div_acctnum = getAcctNum(); 
        String div_data = "The name of the company: " + name +
                          "\nThe Account #: " + div_acctnum +
                          "\nThe Country: " + this.country +
                          "\nand the spoken Language is " + this.lang;
        return div_data;
    }

}