/*
 * This is the resource I used for my discussion board
 * https://www.geeksforgeeks.org/javafx-lineargradient-class/
 */
package linear_gradient_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.geometry.*;
import javafx.scene.shape.*;

public class Linear_Gradient_1 extends Application {

    // launch the application
    @Override
    public void start(Stage stage)
    {

        try {

            // set title for the stage
            stage.setTitle("Linear Gradient");

            // create stops
            Stop[] stop = {new Stop(0, Color.RED), 
                           new Stop(0.5, Color.WHITE), 
                           new Stop(1, Color.BLUE)};

            // create a Linear gradient object
            LinearGradient linear_gradient = new LinearGradient(0, 0,
                              1, 0, true, CycleMethod.NO_CYCLE, stop);

            // create a circle
            Circle circle = new Circle(100, 100, 70);

            // set fill
            circle.setFill(linear_gradient);

            // create VBox
            VBox vbox = new VBox(circle);

            // ste Alignment
            vbox.setAlignment(Pos.CENTER);

            // create a scene
            Scene scene = new Scene(vbox, 400, 300);

            // set the scene
            stage.setScene(scene);

            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[])
    {

        // launch the application
        launch(args);
    }
}
