/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.orgontrail.exceptions.GameControlException;

/**
 *
 * @author David
 */
public class WagonControl {
    public static String getWagonPace(){
        return "";
    }
    public static String getWagonRations(){
        return "";
    }
    public static String getWagonHealth(){
        return "";
    }
    public static void changePace(String pace){
    }
    public static void changeRations(){
        
    }
    public static void killPlayer(){
        
    }
    public static void findCurrentSpeed(){
        
    }
    public static void findCurrentWeather(){
        
    }
    public static void healthLossEvaluation(){
        
    }
    public static void findRationLossRate(){
        
    }
    public static Wagon createWagon() throws GameControlException {
      Wagon wagon = new Wagon();
      if (wagon == null) {
          throw new GameControlException("ERROR: Create Wagon Failed");
      }
      return wagon;
    }
}
