
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.MapLocations;
import byui.cit260.orgontrail.exceptions.GameControlException;
import byui.cit260.orgontrail.exceptions.MapControlException;

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
    
    public static Map createMap() throws GameControlException {
      Map map = new Map();
      //force map to be null for testing
      map = null;
      if (map == null) {
        //throw exception because map failed to load;
        throw new GameControlException("ERROR: Failed to create map.");
      }
      //associate locations to map - still not sure how to do this!!!!!!!!!
      Location locations = createLocations();
      //if (locations == null) {
        //throw exception because locations failed to create;
        //throw new MapControlException("Error creating locations.");
     // }
      return map;
    }
    
    public static Location createLocations() throws GameControlException {
      throw new GameControlException("ERROR: Failed to create locations.");

      //MapLocations [] locations = MapLocations.values();
      //now do we need to loop through the array and assign scenes to it?
      
      //then stick locations into an array and assign to the map
      //Location location = new Location();//this isn't right yet becuase we want all the locations not just one
      //return location;
    }
    
}
