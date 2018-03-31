/*
 * created by Brad R. Allen
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.orgontrail.exceptions.GameControlException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;

/**
 *
 * @author bradrallen
 */
public class SaveGameView extends View {
  
public SaveGameView() {
        super("TEMP Enter the file path where you want to save the game.");
    }

  @Override
  public boolean doAction(String inputs) {
        String filePath;
        filePath = inputs;
        Game game = OregonTrail.getCurrentGame();
        GameControl.saveGameFile(game);
          return false;
        
            }

  @Override
    public String getInput() {
        String[] inputs = new String[1];
        boolean valid = false;
        String input = null;
        try {
            while (!valid) {
                input = this.keyboard.readLine();
                input = input.trim();
                this.console.println(this.displayMessage);
                if (input.length() < 1) {//blank value entered
                    System.out.print("You must enter a value.\n");
                } else {
                    inputs[0] = input;
                    valid = true;
                }
            }
            return inputs[0];
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inputs[0];
    }
    
}
