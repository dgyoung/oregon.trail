/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author MasterCraft Computer
 */
public class PaceMenuHelpView {
  public void displayMenuHelpView(){
        boolean endOfView = false;
        
        do {
            String [] inputs = getInputs();
            if (inputs.length <1 || inputs[0].toUpperCase().equals("Q")){
              return;
            }
            endOfView = doAction(inputs);
        } while (endOfView == false);    }

    private String[] getInputs() {
     String [] inputs = new String[1];
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("================================================= ");
        System.out.println("Pace HELP MENU");
        System.out.println("Steady - You travel about 8 hours a day, taking "
                + "/nfrequent rests. You take care not to get too tired.");
        System.out.println("Strenuous - You travel about 12 hour a day, starting"
                + "/njust after sunrise and stopping shortly before sunset. "
                + "/nYou stop to rest only when necessary. You finish each day feeling very tired.");
        System.out.println("Grueling - You travel about 16 hours a day, starting before "
            + "/nsunrise and continuing until dark. You almost never stop to rest."
            + "/nYou do not get enough sleep at night. You finish each day "
            + "/nfeeling absolutely exhausted, and your health suffers.");
        System.out.println("C - Continue");
        System.out.println("================================================= ");
        
        while (valid == false) {
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
            case "C":
                return true;
            default:
                System.out.println("Invalid menu item. Please try again:\n");
                break;
        }
        return false;
    }    
}

