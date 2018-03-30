package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;

/**
 *
 * @author MasterCraft Computer
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

//playersName = get the first value in the inputs array
        boolean endOfView = false;

        do {

            String inputs = this.getInput();
            if (inputs.toUpperCase().equals("Q")) {
                return; //exits program
            }
            //ENDIF endOfView = doAction(inputs)
            endOfView = this.doAction(inputs);
        } while (!endOfView); //WHILE endOfView != true ;
    }

        @Override
        public String getInput() {
        String[] inputs = new String[1];
          boolean valid = false;
            
          String input = null;
          try {
            while (!valid) {          
              System.out.print("\n" + this.displayMessage);
              //get value entered from keyboard
              input = this.keyboard.readLine();
              input = input.trim();

              if (input.length() < 1) {//blank value entered
                System.out.print("You must enter a value.\n");
              } else {
                inputs[0] = input;
                valid = true;
              }
            }
          } catch (Exception ex) {
            System.out.println("Error reading input: " + ex.getMessage());
          }            
          return inputs[0];
        }
    
}
