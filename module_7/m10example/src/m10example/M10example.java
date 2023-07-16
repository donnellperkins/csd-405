/*
 * Donnell Perkins
 * Due Date: 07/13/2023
 * 
 * Module 10 Discussion Board - Disabling GUI Components 
 * Resources: https://www.tutorialspoint.com/how-to-disable-a-menu-item-in-javafx
 */
package m10example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * Create a drop down menu and disable some of the options.
 */
public class M10example extends Application {

    @Override
   public void start(Stage stage) {
      /*################## DropDown 1 ##############################*/
      //Creating toggle buttons
      RadioButton button1 = new RadioButton("Mario");
      RadioButton button2 = new RadioButton("Yoshi");
      RadioButton button3 = new RadioButton("Luigi");
      ToggleGroup group1 = new ToggleGroup();
      group1.getToggles().addAll(button1, button2, button3);
       
      //Adding the toggle button to the pane
      VBox box1 = new VBox(10);
      box1.setPadding(new Insets(10));
      box1.getChildren().addAll(button1, button2, button3);
       
      //Creating the TitlePane
      TitledPane pane1 = new TitledPane("Nintendo Characters", box1);
      pane1.setLayoutX(1);
      pane1.setLayoutY(1);
       
      /*################## DropDown 2 ##############################*/
       
      //creating labels 
      Text text1 = new Text("Email");
      Text text2 = new Text("Password");
      Text text3 = new Text("Login");
	  
      //Creating Text and Button fields       
      TextField textField1 = new TextField();       
      TextField textField2 = new TextField();
      Button button4 = new Button();
      button4.setText("Example Button");
      
      // Property & Binding 
      // Checks if the text fields are empty, if so disable.
      button4.disableProperty().bind(textField1.textProperty().isEmpty().or 
                                    (textField2.textProperty().isEmpty()));
      //Disables the button
      //button4.setDisable(true);
      
      //Creating a Grid Pane for the labels and fields
      GridPane gridPane = new GridPane();    
      
      //Setting size for the pane  
      gridPane.setMinSize(100, 50); 
       
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.BASELINE_LEFT); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 0); 
      gridPane.add(textField1, 1, 0); 
      gridPane.add(text2, 0, 1);       
      gridPane.add(textField2, 1, 1);
      gridPane.add(text3, 0, 2);       
      gridPane.add(button4, 1, 2);
      
      //Creating the TitlePane
      TitledPane pane2 = new TitledPane();
      pane2.setText("Fields, Labels, & Buttons");
      pane2.setContent(gridPane);
      pane2.setLayoutX(1);
      pane2.setLayoutY(1);
       
      /*################## Creating THE Accordion ##############################*/
      Accordion accor = new Accordion();
      accor.getPanes().add(pane1);
      accor.getPanes().add(pane2);
      VBox vbox = new VBox(accor); 
      
      //Setting the stage
       Scene scene = new Scene(vbox, 450, 200, Color.GREEN);
       stage.setTitle("M10 Accordion Layout");
       stage.setScene(scene);
       stage.show();
   }
   public static void main(String args[]){
      launch(args);
   }
}
