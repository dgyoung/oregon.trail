package byui.cit260.oregontrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import oregontrail.OregonTrail;

/**
 *
 * @author MasterCraft Computer
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();

//    public View() {
//    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean endOfView = false;
        do {
            //prompt for input
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
        
        boolean valid = false;
        String selection = null;
        
        try {
            while (!valid) {
                
               this.console.println("\n" + this.displayMessage + "\n");
               selection = this.keyboard.readLine();
                if (selection.length() < 1) {//blank value entered
                    this.console.println("You must enter a value.\n");
                    continue;
                }
                break;
            }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());
            this.console.println("\n" + this.displayMessage + "\n");
        }
        return selection;
    }

}
