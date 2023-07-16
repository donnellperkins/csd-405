/*
 * Donnell Perkins
 * Due Date: 07/16/2023
 * From Module 10 - Add Refresh Button to the cards Assignment.
 * 
 */
package m10cardrefreshassign;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;


public class M10RefreshButton extends Application {
    static final int TOTAL_CARDS = 52;
    
    @Override
    public void start (Stage stage) {
        // Create a VBox 
        VBox vBox = new VBox(50);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(5, 5, 5, 5));

        // Create a HBox
        HBox hBox = new HBox(25);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(5, 5, 5, 5));
        getRandomCards(hBox);
        
        // Create my button
        Button button = new Button("Refresh");
        // Call the Random Cards function to get a new set of cards
        // when button is pressed.
        button.setOnAction(e -> getRandomCards(hBox));
        
        // Place nodes in vbox
        vBox.getChildren().addAll(hBox, button);
        
        Scene scene = new Scene(vBox);
        stage.setTitle("Displaying 4 Random Cards");
        stage.setScene(scene);
        stage.show();
              
    }
    
    // Method to shuffle the deck and get new set of cards to display
    private void getRandomCards(HBox pane) {

        pane.getChildren().clear();
        // Create a deck of card
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < TOTAL_CARDS; i++) {
                cards.add(i + 1);
        }

        // shuffle deck
        java.util.Collections.shuffle(cards);


        // Add nodes/cards to pane
        for (int i = 0; i < 4; i++) {
            pane.getChildren().add(new ImageView(new Image("file:cards/" +
                                        cards.get(i) + ".png")));
        }
    }
    
    // Launch the Card Application
    public static void main(String[] args) {
        launch(args);
    }
    
}   