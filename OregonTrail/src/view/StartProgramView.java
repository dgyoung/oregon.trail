/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;
import model.Player;

/**
 *
 * @author bradrallen
 */
public class StartProgramView {
    public StartProgramView(){
        
    }
    private String[] getInputs(){
        String [] inputs;
        inputs = new String[1];
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("================================================= ");
        System.out.println("This is the Oregon Trail Game");
        System.out.println("Try to get you and your wagon safley to Oregon");
        System.out.println("================================================= ");
        while (valid == false) {
            System.out.print("Please enter your name or type Q to quit:\n");
            String input = keyboard.nextLine().trim();
            
            if (input.length()<1){
                System.out.print("You must enter a non-blank value.\n");
            }else{
                inputs[0] = input;
                valid = true;
            }
        }
        return inputs;
    }
        private boolean doAction(String[] inputs){
//playersName = get the first value in the inputs array
//player = savePlayer(playersName)
//IF player == null
//display “Could not create the player. “ +
//“Enter a different name.”
//RETURN false
//ENDIF
//DISPLAY "================================================= "
//+ "Welcome to the game " + playersName
//+ "We hope you have a lot of fun!”
//+ "================================================= "
//mainMenuView = Create a new MainMenuView object
//mainMenuView.displayMainMenuView()
//RETURN true
        
        //if (isInteger(inputs[0],10) != false){
//            int inputValues = Integer.parseInt(inputs[0]);
//        } else {
//            String inputsValues = inputs[0];
//        }
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        if (player == null){
            System.out.println("Could not create the player. Enter a different name.");
            return false;
        }
        System.out.println("================================================= ");
        System.out.println("Welcome to the game " + playersName);
        System.out.println("We hope you have a lot of fun!");
        System.out.println("================================================= ");
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
        
        
        return true;
    }


     public void displayStartProgramView(){
//        endOfView = false
//        DO
//        inputs = getInputs()
//        IF no inputs were entered OR the first input is Q
//        RETURN
//        ENDIF
//        endOfView = doAction(inputs)
//        WHILE endOfView != true

        boolean endOfView = false;
        
        do {
            String [] inputs = getInputs();
            if (inputs.length <1 || inputs[0].toUpperCase().equals("Q"))
            {
                return;
            }
            endOfView = doAction(inputs);
        } while (endOfView == false);
    }
}
