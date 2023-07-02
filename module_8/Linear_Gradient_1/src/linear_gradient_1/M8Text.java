/*
 * This is resource I used for JavaFX text
 * https://www.tutorialspoint.com/javafx/javafx_text.htm
 */
package linear_gradient_1;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.stage.Stage; 
import javafx.scene.text.Text; 

public class M8Text extends Application {
    
    @Override 
   public void start(Stage stage) {       
      //Creating a Text object 
      Text text = new Text();      
      
      //Setting the text to be added. 
      text.setText("Happy 4th of July"); 
       
      //setting the position of the text 
      text.setX(50); 
      text.setY(50); 
         
      //Creating a Group object  
      Group root = new Group(text);   
               
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Holiday Message!"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
} 
