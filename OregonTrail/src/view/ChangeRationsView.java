/*
 * created by Brad R. Allen
 */
package view;

import control.ResourceControl;
import java.util.Scanner;
import model.Wagon;

/**
 *
 * @author bradrallen
 */
public class ChangeRationsView {
      public void displayChangeRationsView(){
        boolean done = false; //set flag to not done
        do {
            //prompt for and get the desired rations
            String menuOption = this.getInputs();
            if (menuOption.toUpperCase().equals("Q"))//user wants to quit
                return; //exit game
            
            // do the requested action and display the correct view
            done = this.doAction(menuOption);
        } while (!done);
    }

  private String getInputs() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String userInput = null;

        System.out.println("================================================= ");
        System.out.println("CHANGE FOOD RATIONS");
        System.out.println("Your current rations are 'filling'");
        System.out.println("Select your desired rations:");
        System.out.println("1 - Filling");
        System.out.println("2 - Meager");
        System.out.println("3 - Bare Bones");
        System.out.println("4 - Find out what these different rations mean");
        System.out.println("E - Exit");
        System.out.println("================================================= ");
        

        while (!valid) { //(!valid) is the same thing as (valid == false)
            System.out.print("Please make your selection:\n");
            //get the value entered by user
            userInput = keyboard.nextLine().trim();
            if (userInput.length()<1){//blank value entered
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
            case "1":
                updateRations("Filling");
                break;
            case "2":
                updateRations("Meager");
                break;
            case "3":
                updateRations("BareBones");
                break;
            case "4"://explain what they mean
                rationsExplanation();
                break;
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item. Please try again:\n");
                break;
        }
        return false;
  }

  private void updateRations(String rations) {
    System.out.println("*** updateRations() " + rations + " ***");
  }

  private void rationsExplanation() {
    ChangeRationsHelpView changeRationsHelpView = new ChangeRationsHelpView();
    changeRationsHelpView.displayRationsHelpView();
  }
  
}
