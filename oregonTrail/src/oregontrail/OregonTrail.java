/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.HuntingScene;
import byui.cit260.oregontrail.model.River;
import byui.cit260.oregontrail.model.SceneDescription;
import byui.cit260.oregontrail.model.StoreScene;
import byui.cit260.oregontrail.model.Character;
import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.control.GameControl;
import static byui.cit260.oregontrail.control.GameControl.getFinalScore;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.view.StartProgramView;


public class OregonTrail {

    private static Player player = null;
    private static Game currentGame = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }
    
    public static void pressAnyKeyToContinue()
 {      System.out.println("Press any key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
 }

    
    public static void main(String[] args) {
        //System.out.println(getFinalScore(5000, 3, 6));
        try{
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        } catch (Throwable e){
            System.out.println("you did it wrong ---> " + e);
            e.printStackTrace();
        }
       
    }
  
}