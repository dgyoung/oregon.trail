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
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        boolean endOfView = false;
        
        do {
            String [] inputs = getInput();
            if (inputs.length <1 || inputs[0].toUpperCase().equals("Q"))
            {
                return;
            }
            endOfView = doAction(inputs);
        } while (endOfView == false);    }

    @Override
    private String[] getInput() {
        String [] inputs = new String[1];
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);

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




}
