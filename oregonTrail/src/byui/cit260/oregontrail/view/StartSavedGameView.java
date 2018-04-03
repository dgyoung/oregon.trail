/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.orgontrail.exceptions.GameControlException;
import java.io.IOException;
import oregontrail.OregonTrail;

/**
 *
 * @author David
 */
public class StartSavedGameView extends View{

    public StartSavedGameView() {
      super("**** The Oregon Trail – LOAD SAVED GAME MENU *****\n"
                + "\nEnter the name of your game file:\n");
    }

    @Override
    public boolean doAction(String inputs) {
      String filePath;
      filePath = inputs;
      try{
        GameControl.getGame(filePath);
      }catch (GameControlException | IOException | ClassNotFoundException ex) {
        return false;
      }
      GameMenuView gameMenuView = new GameMenuView();
      gameMenuView.display();
      return true;
  }
    
}
