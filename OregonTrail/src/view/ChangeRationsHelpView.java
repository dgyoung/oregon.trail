/*
 * created by Brad R. Allen
 */
package view;

import java.util.Scanner;

/**
 *
 * @author bradrallen
 */
public class ChangeRationsHelpView {
  public void displayRationsHelpView(){
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
        System.out.println("RATIONS HELP MENU");
        System.out.println("Steady - You travel about 8 hours a day, taking frequent rests. You take care not to get too tired.");
        System.out.println("Strenuous - You travel about 12 hour a day, starting just after sunrise and stopping shortly before sunset. You stop to rest only when necessary. You finish each day feeling very tired.");
        System.out.println("Grueling - You travel about 16 hours a day, starting before sunrise and continuing until dark. You almost never stop to rest. You do not get enough sleep at night. You finish each day feeling absolutely exhausted, and your health suffers.");
        System.out.println("C - Continue");
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
        switch (menuItem) {
            case "G":
                displayGoal();
                break;
            case "M":
                displayHowToMove();
                break;
            case "E":
                displayEstimate();
                break;
            case "H":
                displayHarvest();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item. Please try again:\n");
                break;
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
