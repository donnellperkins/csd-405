/**
 * Donnell Perkins
 * Due Date: 06/04/2023
 * Module 2 - Create a new class called UseFans and 
 * displays the collection of Fans. 
 * 
 */
package module_2p;

import module_1p.*;

public class UseFans{

    public static void main(String [] args) {
        
        UseFans data = new UseFans();
        FanSpeedProject models[] = new FanSpeedProject[5];
        FanSpeedProject default_model = new FanSpeedProject();
        
        // Create a Collection of Fans
        for(int i = 0; i < models.length; ++i) {
            models[i] = new FanSpeedProject();
        }

        // Display Default Fan
        System.out.printf("---- Default Model ----\n");
        default_model.printFanModel();
        System.out.printf("\n");

        // Display Collection of Fans
        for(int i = 0; i < models.length; ++i) {
            System.out.printf("---- Model " + i + " ----");
            data.changeFanData(models[i], 2, true, ((i * 2) + 1), "blue");
            System.out.println();
            data.printFanFunctionality(models[i]);
            System.out.printf("\n");
        }
    }
    // Uses the FanSpeedProject.java file to print the Fan Functionality
    public void printFanFunctionality(FanSpeedProject fan) {
        fan.printFanModel();
    }
    // Uses the FanSpeedProject.java file to change the Fan Functionality
    public void changeFanData(FanSpeedProject fan, int spd, boolean pwr, float rad, String c) {
        fan.changeFanModel(spd, pwr, rad, c);
    }
}