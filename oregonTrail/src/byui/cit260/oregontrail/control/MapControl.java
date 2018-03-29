
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Scene;
import byui.cit260.orgontrail.exceptions.GameControlException;

public class MapControl {
  
  public static void move(WagonControl wagon, int location){
  }
    //public static Map createMap(int noOfRows, int noOfColumns)
  public static Map createMap(int noOfRows, int noOfColumns) throws GameControlException {
    if(noOfRows <0 || noOfColumns <0){
            return null;
    }
    
    Map map = new Map();
    //map = null; //force map to be null for testing

    if (map == null) {
      //throw exception because map failed to load;
      throw new GameControlException("ERROR: Failed to create map.");
    }
    return map;
  }

     
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
     
   
    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        Scene isStart = new Scene();
        isStart.setDescription("This is the start of the game!");
        isStart.setMapSymbol(" STRT ");
        scenes[SceneType.isStart.ordinal()] = isStart;
        
        Scene end = new Scene();
        end.setDescription("This is the end of the game!");
        end.setMapSymbol(" END ");
        scenes[SceneType.end.ordinal()] = end;
        
        Scene error = new Scene();
        error.setDescription("There was an error generating this scene!");
        error.setMapSymbol(" ER ");
        scenes[SceneType.error.ordinal()] = error;
        
        Scene store = new Scene();
        store.setDescription("This is a store!");
        store.setMapSymbol(" END ");
        scenes[SceneType.store.ordinal()] = store;
        
        Scene river = new Scene();
        river.setDescription("This is a river!");
        river.setMapSymbol(" RVR ");
        scenes[SceneType.river.ordinal()] = end;
        
        Scene fort = new Scene();
        fort.setDescription("This is a fort!");
        fort.setMapSymbol(" FRT ");
        scenes[SceneType.fort.ordinal()] = fort;
        
        Scene town = new Scene();
        town.setDescription("This is a town!");
        town.setMapSymbol(" TWN ");
        scenes[SceneType.town.ordinal()] = town;
        
        Scene landmark = new Scene();
        landmark.setDescription("This is a landmark!");
        landmark.setMapSymbol(" LNDMRK ");
        scenes[SceneType.landmark.ordinal()] = landmark;
        
        return scenes;
    }
}
