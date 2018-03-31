package oregontrail;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.view.StartProgramView;
import byui.cit260.oregontrail.view.ErrorView;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


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
        catch(IOException ex)
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
        
        try{
          //open character stream files for end users input and output
          OregonTrail.inFile = new BufferedReader(new InputStreamReader(System.in));          
          OregonTrail.outFile = new PrintWriter(System.out, true);
          
        String filePath = "log.txt";
        OregonTrail.logFile = new PrintWriter(filePath);

        //create StartProgramView and start the program
          StartProgramView startProgramView = new StartProgramView();
          startProgramView.display();
          
        } catch (FileNotFoundException ex){
          ErrorView.display("OregonTrail", "Exception: " + ex.toString() +
                             "\nCause: " + ex.getCause() +
                             "\nMessage: " + ex.getMessage());
          
        } finally {
            try {
                if (OregonTrail.inFile !=null) {
                    OregonTrail.inFile.close();
                }
                if (OregonTrail.outFile !=null){
                    OregonTrail.outFile.close();
                }
                if (OregonTrail.logFile != null) {
                    OregonTrail.logFile.close();
                }
            } catch (IOException ex){
                ErrorView.display("OregonTrail", "Error closing files");
                return;
            }
            
        }
       
    }
  
}