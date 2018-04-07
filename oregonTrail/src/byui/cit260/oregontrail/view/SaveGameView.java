package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.orgontrail.exceptions.GameControlException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;

public class SaveGameView extends View {
  
  public SaveGameView() {
        super("**** The Oregon Trail – SAVE GAME MENU *****\n"
                + "\nEnter a name for your game file:\n"
              );
    }

  @Override
  public boolean doAction(String inputs) {
        String filePath;
        filePath = inputs;
        Game game = OregonTrail.getCurrentGame();
        try{
          GameControl.saveGameFile(game,filePath);
        }catch (GameControlException | IOException ex) {
          this.console.println("Error Saving File:" + ex.getMessage());
          return false;
        }
        this.console.println("File " + filePath + " was saved sucessfully");
          return true;
  }


    
}
