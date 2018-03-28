
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.MapLocations;
import byui.cit260.orgontrail.exceptions.GameControlException;
import byui.cit260.orgontrail.exceptions.MapControlException;

public class MapControl {
  
    public static void move(WagonControl wagon, int location){
    

    public static Map createMap(int noOfRows, int noOfColumns) throws GameControlException {
        if(numOfRows <0 || numOfColumns <0){
            return null;
        }
     Map map = new Map();
      //force map to be null for testing
      map = null;
      if (map == null) {
        //throw exception because map failed to load;
        throw new GameControlException("ERROR: Failed to create map.");
      }
      //associate locations to map - still not sure how to do this!!!!!!!!!
      private static Location createLocations(int rows, int columns) throws GameControlException {
      throw new GameControlException("ERROR: Failed to create locations.");
      Location locations = createLocations(noOfRows, noOfColumns);
      }
      //if (locations == null) {
        //throw exception because locations failed to create;
        //throw new MapControlException("Error creating locations.");
     // }
     
     public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        int sceneLength = scenes.length;
        int curScene = SceneType.isStart.ordinal();
        int rows = locations[0].length;
        int columns = locations[1].length;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (curScene <= sceneLength) {
                    locations[row][column].setScene(scenes[curScene]);
                    locations[row][column].setLocationName(scenes[curScene].getMapSymbol());
                    if (" HB ".equals(scenes[curScene].getMapSymbol())) {
                        locations[row][column].setIsStart(true);
                    }
                    curScene++;
                } else {
                    locations[row][column].setScene(scenes[SceneType.error.ordinal()]);
                }
            }
        }
    }
      return map;
    }
    


      //MapLocations [] locations = MapLocations.values();
      //now do we need to loop through the array and assign scenes to it?
      
      //then stick locations into an array and assign to the map
      //Location location = new Location();//this isn't right yet becuase we want all the locations not just one
      //return location;
    }
    
}
