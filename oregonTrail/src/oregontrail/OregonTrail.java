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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OregonTrail {

    private static Player player = null;
    private static Game currentGame = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

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

  public static PrintWriter getOutFile() {
    return outFile;
  }

  public static void setOutFile(PrintWriter outFile) {
    OregonTrail.outFile = outFile;
  }

  public static BufferedReader getInFile() {
    return inFile;
  }

  public static void setInFile(BufferedReader inFile) {
    OregonTrail.inFile = inFile;
  }

  public static PrintWriter getLogFile() {
    return logFile;
  }

  public static void setLogFile(PrintWriter logFile) {
    OregonTrail.logFile = logFile;
  }
    
    
    public static void main(String[] args) throws IOException {
        //System.out.println(getFinalScore(5000, 3, 6));
        
        try{
          //open character stream files for end users input and output
          OregonTrail.inFile = new BufferedReader(new InputStreamReader(System.in));          
          OregonTrail.outFile = new PrintWriter(System.out, true);
          
          //create StartProgramView and start the program
          StartProgramView startProgramView = new StartProgramView();
          startProgramView.display();
          return;
          
        } catch (Throwable ex){
          System.out.println("Exception: " + ex.toString() +
                             "\nCause: " + ex.getCause() +
                             "\nMessage: " + ex.getMessage());
          ex.printStackTrace();
        }
        finally {
          try {
            OregonTrail.inFile.close();
            OregonTrail.outFile.close();  
          } catch (IOException ex){
            Logger.getLogger(OregonTrail.class.getName()).log(Level.SEVERE, "Input or Output file failed to close");
          }
        }
       
    }
  
}