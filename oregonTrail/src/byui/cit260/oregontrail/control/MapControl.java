/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.MapLocations;

/**
 *
 * @author David
 */
public class MapControl {
    public static void move(WagonControl wagon, int location){
        
    }
    public static boolean validLocation(){
        return true;
    }
    public static void visitRegularScene(){
        
    }
    public static void visitStoreScene(){
        
    }
    public static void visitRiverScene(){
        
    }
    public static void visitHuntingScene(){
        
    }
    public static int setDistanceTraveled(int currentLocation){
        return 0;
    }
    public static int distacneToNextLocation(){
        return 0;
    }
    
    
    public static Map createMap() {
      Map map = new Map();
      
      
      Location locations = createLocations();
      
      return map;
    }
    
    public static Location createLocations() {
      MapLocations [] locations = MapLocations.values();
      //now we need to loop through the array and assign scenes to it
      
      //then stick locations into an array and assign to the map
      Location location = new Location();//this isn't right yet becuase we want all the locations not just one
      return location;
    }
    
}
