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

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision() {
    }

    public DomesticDivision(String div_name, BigInteger div_acctnum,
                                String div_state) {
        this.state = div_state;

        setName(div_name);
        setAcctNum(div_acctnum);
    }

    // Set the state
    public String getState() {
        return state;
    }

    // Set the State 
    public void setState(String div_state) {
        this.state = div_state;
    }

    // Display the Domestic Data
    public String display() {
        String name = getName();
        BigInteger div_acctnum = getAcctNum(); 
        String div_data = "The name of the company: " + name +
                          "\nThe Account #: " + div_acctnum +
                          "\nThe State: " + this.state;
        return div_data;
    }

}