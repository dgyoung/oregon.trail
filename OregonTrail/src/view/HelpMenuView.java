/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author bradrallen
 */
public class HelpMenuView {
    public void displayHelpMenuView(){
        boolean endOfView = false;
        
        do {
            String [] inputs = getInputs();
            if (inputs.length <1 || inputs[0].toUpperCase().equals("Q"))
            {
                return;
            }
            endOfView = doAction(inputs);
        } while (endOfView == false);    }

    private String[] getInputs() {
     String [] inputs = new String[1];
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("================================================= ");
        System.out.println("HELP MENU");
        System.out.println("G - What is the goal of the game?");
        System.out.println("M - How to move");
        System.out.println("E - Estimate the number of resources");
        System.out.println("H - Harvest resources");
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
        String menuItem = inputs[0].toUpperCase();
        if(menuItem.equals("G")){
            displayGoal();
        } else if(menuItem.equals("M")){
            displayHowToMove();
        } else if(menuItem.equals("E")){
            displayEstimate();
        } else if(menuItem.equals("H")){
            displayHarvest();
        } else if(menuItem.equals("Q")){
            return true;
        } else {
            System.out.println("Invalid menu item. Please try again:\n");
        }
        return false;
    }

    private void displayGoal() {
        System.out.println("*** displayGoal() ***");
    }

    private void displayHowToMove() {
        System.out.println("*** displayHowToMove() ***");
    }

    private void displayEstimate() {
        System.out.println("*** displayEstimate() ***");
    }

    private void displayHarvest() {
        System.out.println("*** displayHarvest() ***");
    }
}
