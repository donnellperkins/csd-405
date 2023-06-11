/**
 * Donnell Perkins
 * Due Date: 06/04/2023
 * From Module 1 - Create code to display Fan Speeds.
 * This file is used to modify and display fan functionality
 */
package module_1p;

public class FanSpeedProject {

    Fan model = new Fan();

    public static void main(String[] args) {
        // Gets the Default values of Fan class
        Fan round_1 = new Fan();
        // Passes paraters to the Fan class
        Fan round_2 = new Fan(2, true, 10, "green");

        System.out.printf("---- Default Model ----\n");
        String text1 = round_1.printFanFunctionality();
        System.out.printf(text1);
        System.out.printf("---- Different Model ----\n");
        String text2 = round_2.printFanFunctionality();
        System.out.printf(text2);
        
    }

    public void changeFanModel(int spd, boolean pwr, float rad, String c) {
        this.model.setFanSpeed(spd);
        this.model.setFanStatus(pwr);
        this.model.setFanRadius(rad);
        this.model.setFanColor(c);
    }

    public void printFanModel() {
        String text = this.model.printFanFunctionality();
        System.out.printf(text);
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
    
    Fan(int spd, boolean pwr, float rad, String c) {
        this.speed = spd;
        this.on = pwr;
        this.radius = rad;
        this.color = c;
        
    }

    public void setFanSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    public int getFanSpeed () {
        return speed;
    }

    public void setFanStatus(boolean newPwrStatus) {
        this.on = newPwrStatus;
    }

    public boolean getFanStatus () {
        return on;
    }

    public void setFanRadius(float newRad) {
        this.radius = newRad;
    }

    public float getFanRadius () {
        return radius;
    }

    public void setFanColor (String newColor){
        this.color = newColor;
    }

    public String getFanColor () {
        return color;
    }

    public String printFanFunctionality() {

        String details = "The Fan Speed is set to " + speed + "\n"+
                         "The Power setting is " + on + "\n" +
                         "The Radius of the Fan is " + radius + "\n" +
                         "The Color of the Fan is " + color + "\n";
        return details;
    }

}