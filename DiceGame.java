package com.example.dicerollerapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

public class DiceGame extends Application {

    //We make the dice matriz, and we add the 6 images
    private final Image[] diceImages = new Image[6];
    //we make the 2 images view for the dice
    private final ImageView die1View = new ImageView();
    private final ImageView die2View = new ImageView();
    //we create a random that we use to get the dice value
    private final Random random = new Random();


    public void start(Stage stage) {
        //We add the images so with this form the dice is going to be safe
        // in the pocision 0,and we need to called diferent
        //we use i-1
        for (int i = 0; i < 6; i++) {
            diceImages[i] = new Image((i + 1) + "Die.bmp");
        }

        // we gave the size of the dice (height and width)
        die1View.setFitWidth(100);
        die1View.setFitHeight(100);
        die2View.setFitWidth(100);
        die2View.setFitHeight(100);

        // We inicialized with a random number the program
        rollDice();

        // give values adding the images (just 2)
        //the dice are going to be 2 with 6 possible faces
        HBox diceBox = new HBox(20, die1View, die2View);
        diceBox.setAlignment(Pos.CENTER);

        // create the botton to start the game
        Button rollButton = new Button("Start a new game");
        rollButton.setOnAction(e -> rollDice());

        VBox root = new VBox(30, diceBox, rollButton);
        root.setAlignment(Pos.CENTER);

        // create the window and give it a name for that one
        Scene scene = new Scene(root, 300, 250);
        stage.setTitle("Dice Roller 🎲🎲");
        stage.setScene(scene);
        stage.show();
    }

    //create the method roll dice
    private void rollDice() {
        // We generate aleatory numbers between (1-6)
        int die1Value = random.nextInt(6) + 1;
        int die2Value = random.nextInt(6) + 1;

        // We add 1 to 'i' because arrays start at index 0.
        // We subtract 1 from 'value' to match the die value with its image (Die1.png).
        die1View.setImage(diceImages[die1Value - 1]);
        die2View.setImage(diceImages[die2Value - 1]);
    }
}