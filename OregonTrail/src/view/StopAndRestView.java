/*
 * created by Brad R. Allen
 */
package view;

import control.ResourceControl;
import java.util.Scanner;

/**
 *
 * @author bradrallen
 */
public class StopAndRestView {
        public void displayStopAndRestView(){
        boolean done = false; //set flag to not done
        do {
            //prompt for and get the desired rations
            String menuOption = this.getInputs();
            if (menuOption.toUpperCase().equals("Q"))//user want to quit
                return; //exit game
            
            // do the requested action and display the correct view
            done = this.doAction(menuOption);
        } while (!done);
    }

  private String getInputs() {Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String userInput = null;
        System.out.println("================================================= ");
        System.out.println("STOP AND REST");
        System.out.println("How many days would you like to rest?");
        System.out.println("================================================= ");
        

        while (!valid) { //(!valid) is the same thing as (valid == false)
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
        if (menuOption.matches("\\d{1}")){
          int numOfDays = Integer.parseInt(menuOption);
          ResourceControl resourceControl = new ResourceControl();
          resourceControl.stopAndRest(numOfDays);
        }else{
          System.out.println("Invalid entry. Please try again:\n");
        }
        return false;
  }
}
