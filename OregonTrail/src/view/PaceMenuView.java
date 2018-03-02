/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.PaceType;

/**
 *
 * @author MasterCraft Computer
 */
public class PaceMenuView {
    public void displayPaceMenuView(){
        boolean endOfView = false;
        
        do {
            String menuOption = this.getInputs();
            if (menuOption.toUpperCase().equals("Q"))
            {
                return;
            }
            endOfView = this.doAction(menuOption);
        } while (endOfView == false);    
    }

    private String getInputs() {
     Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String userInput = null;

        System.out.println("================================================= ");
        System.out.println("Pace Menu");
        System.out.println("You must set a pace for the day");
        System.out.println("S - Steady");
        System.out.println("M - Strenuous");
        System.out.println("F - Grueling");
        System.out.println("D - Diplasy Menu");
        System.out.println("Q - Quit");
        System.out.println("================================================= ");
        
        while (valid == false) {
            System.out.print("Please make your selection:\n");
            userInput = keyboard.nextLine().trim();
            if (userInput.length()<1){
                System.out.print("You must enter a value.\n");
            }else{
                valid = true;
            }
        }
        return userInput;
    }

    private boolean doAction(String menuOption) {
    
        String menuItem = menuOption.toUpperCase();
        switch (menuItem) {
            case "S":
                updatePace("Steady");
                break;
            case "M":
                updatePace("Strenuous");
                break;
            case "F":
                updatePace("Grueling");
                break;
            case "D"://explain what they mean
                paceExplanation();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item. Please try again:\n");
                break;
        }
        return false;
  }
    
  private void updatePace(String pace) {
    System.out.println("*** updatePace() " + pace + " ***");
  }

  private void paceExplanation() {
    PaceMenuView paceMenuView = new PaceMenuView();
        paceMenuView.displayPaceMenuView();
  }
}

