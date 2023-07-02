/*
 * Donnell Perkins
 * Due Date: 07/02/2023
 * 
 * Module 8 - Create a program that randomly selects 4 cards from the 
 * 52cards/pictures file. Display the 4 selected cards.  
 * 
 */
package m8cardassignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.io.InputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.Random;
import java.io.File;

/**
 *
 * @author dperkins
 */
public class M8Cards  extends Application {
    static final int TOTAL_CARDS = 52;
    
    @Override
    public void start (Stage stage) throws IOException {
        // created an array for 4 random numbers
        Integer[] rand_cards = new Integer[4];
        // created to check numbers in array
        boolean check = true;
        
        // Get 4 Random Numbers
        for (int c = 0; c < rand_cards.length; c++) {
            Integer rand_card;
            Random rando = new Random();
            
            // If check is true keep generating new random numbers
            do {
                // Create a new random number
                rand_card = rando.nextInt(TOTAL_CARDS) + 1;
                //Checks to see if the random number is already in the array
                check = Arrays.asList(rand_cards).contains(rand_card);
            }
            while (check);
            // If it is not currently in the array add a new 
            // random number to the array.
            if (check == false) {
                rand_cards[c] = rand_card;
            }
        }
        // Get the current working directory for the first random card
        File cur_dir = new File("cards/" + rand_cards[0]);
        String dir_loc = cur_dir.getAbsolutePath();
        
        InputStream stream = new FileInputStream(dir_loc + ".png");
        Image image = new Image(stream);
        //Creating the view for the 1st Random Card
        ImageView imageView = new ImageView();
        //Setting image to the image view
        imageView.setImage(image);
        //Setting the image view parameters
        imageView.setX(50);
        imageView.setY(10);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);
        
        // Get the current working directory for the second random card
        File cur_dir1 = new File("cards/" + rand_cards[1]);
        String dir_loc1 = cur_dir1.getAbsolutePath();
        
        InputStream stream1 = new FileInputStream(dir_loc1 + ".png");
        Image image1 = new Image(stream1);
        //Creating the 2nd Random Card view
        ImageView imageView1 = new ImageView();
        //Setting image to the image view
        imageView1.setImage(image1);
        //Setting the image view parameters
        imageView1.setX(175);
        imageView1.setY(10);
        imageView1.setFitWidth(100);
        imageView1.setPreserveRatio(true);
        
        // Get the current working directory for the third random card
        File cur_dir2 = new File("cards/" + rand_cards[2]);
        String dir_loc2 = cur_dir2.getAbsolutePath();
        
        InputStream stream2 = new FileInputStream(dir_loc2 + ".png");
        Image image2 = new Image(stream2);
        //Creating the view for the 3rd Random Card
        ImageView imageView2 = new ImageView();
        //Setting image to the image view
        imageView2.setImage(image2);
        //Setting the image view parameters
        imageView2.setX(300);
        imageView2.setY(10);
        imageView2.setFitWidth(100);
        imageView2.setPreserveRatio(true);
        
        // Get the current working directory for the fourth random card
        File cur_dir3 = new File("cards/" + rand_cards[3]);
        String dir_loc3 = cur_dir3.getAbsolutePath();
        
        InputStream stream3 = new FileInputStream(dir_loc3 + ".png");
        Image image3 = new Image(stream3);
        //Creating the view for the 4th Random Card
        ImageView imageView3 = new ImageView();
        //Setting image to the image view
        imageView3.setImage(image3);
        //Setting the image view parameters
        imageView3.setX(425);
        imageView3.setY(10);
        imageView3.setFitWidth(100);
        imageView3.setPreserveRatio(true);
        
        //Setting the Scene object
        Group root = new Group(imageView, imageView1,imageView2, imageView3);
        Scene scene = new Scene(root, 575, 275);
        stage.setTitle("Displaying 4 Random Cards");
        stage.setScene(scene);
        stage.show();
    }
    // Launch the Card Application
    public static void main(String[] args) {
        launch(args);
    }
    
}
