package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
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
    public void display() {

//playersName = get the first value in the inputs array
        boolean endOfView = false;

        do {

            String inputs = this.getInput();
            if (inputs.toUpperCase().equals("4")) {
                return; //exits program
            }
            //ENDIF endOfView = doAction(inputs)
            endOfView = this.doAction(inputs);
        } while (!endOfView); //WHILE endOfView != true ;
    }

        @Override
        public String getInput
        
            () {
        String[] inputs = new String[1];
            boolean valid = false;
            Scanner keyboard = new Scanner(System.in);
            String input = null;
            while (valid == false) { //(!valid) is the same thing as (valid == false)
                System.out.print("\n" + this.displayMessage);
                input = keyboard.nextLine().trim();
                if (input.length() < 1) {//blank value entered
                    System.out.print("You must enter a value.\n");
                } else {
                    inputs[0] = input;
                    valid = true;
                }
            }
            return inputs[0];
        }

    
}
