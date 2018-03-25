/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.orgontrail.exceptions.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author David
 */
public class RiverControl {
    
    public static String findCurrentWeather(){
        return "";
    }
    public static boolean calculateFording(int riverWidth, int riverDepth)
    {
        int calculateFording = 0;
        if (calculateFording < 0)
        {
        return false;
        }
        else
        return true;
    }
    public static boolean calculateCaulk(int riverWidth, int riverDepth)
    {
        int calculateCaulk = 0;
        if (calculateCaulk < 0)
        {
        return false;
        }
        else
        return true;
    }
    public static void findHelpCost()
    {
        
    }
    public static boolean calculateFerry()
    {
        int calculateFerry = 0;
        if (calculateFerry < 0)
        {
        return false;
        }
        else
        return true;
    }
    
    public RiverControl(boolean calculateFording) throws GamecontrolException{
        if (calculateFording == false) {
            try {
                throw new GameControlException("ERROR: Cannot be less than 0");
                        } catch (GameControlException ex) {
                Logger.getLogger(RiverControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
        
    }
  
    
    private static class GamecontrolException extends Exception {

        public GamecontrolException() {
        }
    }
}
