/*
 * created by team
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;


public enum MapLocations implements Serializable {
  //public enum StoreScene implements Serializable{

  independence("Independence", "", 0),
  kansasRiver("Kansas River Crossing","independence", 102),
  bigBlueRiver("Big Blue River Crossing","kansasRiver", 118),
  fortKearney("Fort Kearney", "bigBlueRiver", 250),
  chimneyRock("Chimeny Rock","fortKearney", 86),
  fortLaramie("Fort Laramie","chimneyRock", 190),
  independenceRock("Independene Rock","fortLaramie", 102),
  southPass("South Pass", "independenceRock", 58),
  greenRiver("Green River", "southPass", 57),
  fortBridger("Fort Bridger", "southPass", 125),
  sodaSprings("Soda Springs","fortBridger", 143),
  fortHall("Fort Hall", "sodaSprings", 183),
  snakeRiver("Snake River", "fortHall", 113),
  fortBoise("Fort Boise", "snakeRiver",	160),
  blueMountains("Blue Mountains","fortBoise", 55),
  fortWallaWalla("Fort Walla Walla", "blueMountains", 50),
  theDalles("The Dalles", "blueMountains",55),
  theBarlowRoad("The  Barlow Toll Road","theDalles", 78),
  columbiaRiver("The Columbia River","theDalles",30),
  willametteValley01("The Willamette Valley","theBarlowRoad", 25),
  willametteValley02("The Willamette Valley","columbiaRiver", 25);
  
  private String name;
  private String previousLocation;
  private int milesFromPrevious;
  private Scene scene;
  private boolean visited = false;
  
  //create size variable so we know how long to make the Locations array
  private static final int size = MapLocations.values().length;

  //private String dateVisted;

  private MapLocations(String name, String previousLocation, int milesFromPrevious) {
    this.name = name;
    this.previousLocation = previousLocation;
    this.milesFromPrevious = milesFromPrevious;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public void setScene(Scene scene) {
    this.scene = scene;
  }
  public int getSize()
    {return size;
  }
  @Override
  public String toString() {
    return "MapLocations{" + "name=" + name + ", previousLocation=" + previousLocation + ", milesFromPrevious=" + milesFromPrevious + ", scene=" + scene + ", visited=" + visited + '}';
  }


  
}
