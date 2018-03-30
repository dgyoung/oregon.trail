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

    public static void pressAnyKeyToContinue() {
        System.out.println("Press any key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        try {
            OregonTrail.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            OregonTrail.outFile = new PrintWriter(new PrintWriter(System.out), true);
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        } catch (Throwable e) {
            System.out.println("you did it wrong ---> " + e);
            e.printStackTrace();
        }
        finally {
            try {
                if (OregonTrail.inFile != null)
                    OregonTrail.inFile.close();
                if (OregonTrail.outFile != null)
                    OregonTrail.outFile.close();
            } catch (IOException ex) {
                System.out.println("error closing files");
                return;
            }
        }
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

}
