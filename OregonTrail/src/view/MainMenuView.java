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
            if (inputs.length <1 || inputs[0].toUpperCase().equals("Q"))
            {
                return;
            }
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
        

        while (valid == false) {
            System.out.print("Please make your selection:\n");
            String input = keyboard.nextLine().trim();
            if (input.length()<1){
                System.out.print("You must enter a value.\n");
            }else{
                inputs[0] = input;
                valid = true;
            }
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
//    menuItem = first element in inputs array
//convert menuItem to upper case
//SWITCH menuItem
//“N”: startNewGame()
//“R”: restartGame()
//“H”: getHelp()
//“E”: RETURN true
//DEFAULT: DISPLAY “Invalid menu item.”
//ENDSWITCH
//RETURN false
        String menuItem = inputs[0].toUpperCase();
        if(menuItem.equals("N")){
            startNewGame();
        } else if(menuItem.equals("R")){
            restartGame();
        } else if(menuItem.equals("H")){
            getHelp();
        } else if(menuItem.equals("Q")){
            return true;
        } else {
            System.out.println("Invalid menu item. Please try again:\n");
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
