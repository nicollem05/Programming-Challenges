package com.example.dicerollerapp;

import javafx.application.Application;
import com.example.dicerollerapp.DiceGame;

public class AppLauncher {
    public static void main(String[] args) {
       // we call the application
        Application.launch(DiceGame.class, args);
    }
}