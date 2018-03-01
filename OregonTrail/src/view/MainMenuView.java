/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;
import model.OregonTrail;
import model.Player;

/**
 *
 * @author bradrallen
 */
class MainMenuView {
    public void displayMainMenuView(){
        boolean endOfView = false;
        do {
            String [] inputs = getInputs();
            if (inputs.length <1 || inputs[0].toUpperCase().equals("Q"))//user want to quit
                return; //exit game
            // do the requested action and display the correct view
            endOfView = doAction(inputs);
        } while (endOfView == false);
    }

    private String[] getInputs() {
        String [] inputs = new String[1];
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("================================================= ");
        System.out.println("MAIN MENU");
        System.out.println("N - Start new game");
        System.out.println("R - Restart existing game");
        System.out.println("H - Get help on how to play the game");
        System.out.println("Q - Quit");
        System.out.println("================================================= ");
        

        while (valid == false) { //(!valid) is the same thing as (valid == false)
            System.out.print("Please make your selection:\n");
            String input = keyboard.nextLine().trim();
            if (input.length()<1){//blank value entered
                System.out.print("You must enter a value.\n");
            }else{
                inputs[0] = input;
                valid = true;
            }
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "N":
                startNewGame();
                break;
            case "R":
                restartGame();
                break;
            case "H":
                getHelp();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item. Please try again:\n");
                break;
        }
        return false;
    }

    public void startNewGame() {
        GameControl.createNewGame(OregonTrail.getPlayer());
        GameMenuView gameMenuView= new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
    
}
