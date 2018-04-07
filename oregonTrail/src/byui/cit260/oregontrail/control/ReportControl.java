/*
 * created by Brad R. Allen
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.oregontrail.model.Character;
import byui.cit260.orgontrail.exceptions.ReportControlException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import oregontrail.OregonTrail;

/**
 *
 * @author bradrallen
 */
public class ReportControl {
  
  public static void saveReportFile(String report, String filePath) throws ReportControlException, IOException {
      if (report == null || filePath == null) {
        throw new ReportControlException("Invalid Report or File Path");
      }
      switch (report) {
         case "character":
           try (PrintWriter out = new PrintWriter(filePath +".txt")){
             //built title and column headdings
             out.println("\n\n               Character Health               \n"
                          +"================================================\n");
             out.printf("%n%-20s%10s","Name","Health");
             out.printf("%n%-20s%10s","___________________","__________");
             
            //get current game so that we can get the wagon
            Game game = OregonTrail.getCurrentGame();
            //get the wagon so that we can get the ArrayList of characters
            Wagon wagon = game.getWagon();
            //get the ArrayList
            ArrayList<Character> characters = wagon.getCharacters();
            //loop through the characters and build the report
            for(Character character : characters){
              out.printf("%n%-20s%10d",character.getName(),character.getHealth());
            }

           }catch (IOException ex){
            throw ex;
           }
           break;
         default:
          throw new ReportControlException("No Such Report");
      }
    }
}
