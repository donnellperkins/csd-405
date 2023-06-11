/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FanSpeed;

/**
 * Donnell Perkins
 * Due Date: 05/28/2023
 * Module 1 - Create code to display Fan Speeds
 * 
 */
public class FanSpeedProject {

    public static void main(String[] args) {
        // Gets the Default values of Fan class
        Fan round_1 = new Fan();
        // Passes paraters to the Fan class
        Fan round_2 = new Fan(2, true, 10, "green");
        
        System.out.println();
        System.out.println(round_1);
        
        System.out.println();
        System.out.println(round_2);
    }
    
}

class Fan {
    // Fan Speeds
    final static int STOPPED = 0;
    final static int SLOW    = 1;
    final static int MEDIUM  = 2;
    final static int FAST    = 3;
    
    private int speed = STOPPED; // Default fan speed to 0
    private boolean on;          // Fan Power status
    private float radius = 6;    // Default fan radius is 6
    String color = "white";      // Default fan color is white
    
    Fan(){
        
    }
    
    Fan(int spd, boolean pwr, float rad, String c){
        speed = spd;
        on = pwr;
        radius = rad;
        color = c;
        
    }
    
    public String toString(){
        return "The Fan Speed is set to " + speed + "\n"+
                "The Power setting is " + on + "\n" +
                "The Radius of the Fan is " + radius + "\n" +
                "The Color of the Fan is " + color + "\n";
    }
}