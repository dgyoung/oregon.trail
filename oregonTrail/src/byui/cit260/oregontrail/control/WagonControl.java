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
      System.out.println("STUB - Will set Pace to " + pace);
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
      System.out.println("*** createWagon called ***");
      Wagon wagon = new Wagon();
      if (wagon == null) {
          throw new GameControlException("ERROR: Player Object Required");
      }
      try {
        String stringNumber = "a";
        int test = Integer.parseInt(stringNumber);
      } catch (NumberFormatException ex) {
          System.out.println(ex.getMessage() + " Please enter a whole number");
      }
      return wagon;
    }
}
