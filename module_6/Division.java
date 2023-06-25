/**
 * Donnell Perkins
 * Due Date: 06/25/2023
 * 
 * Module 7 - Creating and using abstract classes. 
 * 
 * This class file will be used for company division data. 
 */

package module_6p;

import java.util.*;
import java.math.BigInteger;


public abstract class Division {
    private String name;
    private BigInteger acctnum;

    protected Division() {
    }

    protected Division(String div_name, BigInteger div_acctnum) {
        this.name = div_name;
        this.acctnum = div_acctnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String div_name) {
        this.name = div_name;
    }

    public BigInteger getAcctNum() {
        return acctnum;
    }

    public void setAcctNum(BigInteger div_acctnum) {
        this.acctnum = div_acctnum;
    }

    public abstract String display();
}