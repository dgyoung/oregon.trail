/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import static byui.cit260.oregontrail.control.GameControl.getFinalScore;
import byui.cit260.oregontrail.control.WagonControl;
import byui.cit260.orgontrail.exceptions.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class EndGameView extends View {
    public EndGameView(){
    super("\npress 1 to test EndGameView");
            
        }

        
        @Override
        public boolean doAction(String inputs) {

        String menuOption;
        menuOption = inputs;
        
        //Player player = GameControl.saveGame(menuOption);
        
        if (menuOption == null) {
            System.out.println("Please enter a valid menu option");

            return false;
        }    
        
        switch (menuOption) {
            case "1": {
            try {
                //continue on trail
                int finalScore = getFinalScore(-3983883, 1, 1);
                System.out.println(finalScore);
            } catch (GameControlException ex) {
                Logger.getLogger(EndGameView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            

                break;
            case "2": //check supplies
                break;
            case "3": //display map
                break;
            case "4": //change pace
                break;
            case "5": //change food rations
                
                break;
            case "6": //stop to rest
                System.out.println("\n***** How many days would you like to rest? *****\n");
                // TO INCREMENT THE DATE BY ONE DAY
                // calendar.add(Calendar.DATE, 1);
                // System.out.println("Date : " + sdf.format(calendar.getTime()));
                break;
            case "7": //hunt
                break;
            case "8": //hunt
                System.out.println("\n" +
                "***** If the user chooses Print Report, they are taken to a new view that shows all of the available\n" +
                "reports to print. After choosing a report type, they enter the file location to save the report,\n" +
                "and then are taken back to the menu showing all of the available reports. After a report has\n" +
                "been written (printed) to a file, the user has the option to enter ‘C’ to continue and go back to\n" +
                "the Game Menu, or print another report. All valid inputs and error messages should be implemented. *****\n");
                break;
            default:
                System.out.println("Enter a valid option");

        }
        return false;
    }
}
