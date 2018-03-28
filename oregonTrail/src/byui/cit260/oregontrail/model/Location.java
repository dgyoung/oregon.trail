/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import byui.cit260.oregontrail.control.GameControl;
/**
 *
 * @author allie
 */
public class Location implements Serializable{
    
    private boolean isStart;
    private String locationName; /**name of current location on map*/
    private int xPos;
    private int yPos;
    private Scene scene;
    private boolean Visited;
    private boolean isStartLocation;
    private String weather;
    private Calendar calendar;
    
    public Location(String locationName, int xPos, int yPos){
        this.locationName = locationName;
        this.xPos = xPos;
        this.yPos = yPos;
        if("Start".equals(locationName)){
            isStart = true;
        } 
    }

    Location() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isStartLocation(){
        return isStartLocation;
    }
    
    public void setStartLocation(){
        this.isStartLocation = true;
    }
    
    public boolean Visited() {
        return Visited;
    }
    
    public void setVisited(boolean Visited) {
        this.Visited = Visited;
    }
    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }
    
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
    
    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(String month) {
        this.calendar = calendar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.isStart ? 1 : 0);
        hash = 67 * hash + Objects.hashCode(this.locationName);
        hash = 67 * hash + this.xPos;
        hash = 67 * hash + this.yPos;
        hash = 67 * hash + Objects.hashCode(this.weather);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.isStart != other.isStart) {
            return false;
        }
        if (this.xPos != other.xPos) {
            return false;
        }
        if (this.yPos != other.yPos) {
            return false;
        }
        if (!Objects.equals(this.locationName, other.locationName)) {
            return false;
        }
        return Objects.equals(this.weather, other.weather);
    }

     @Override
    public String toString() {
        return "Location{" + "displaySymbol=" + ", isStart=" + isStart + ", locationName=" + locationName + ", xPos=" + xPos + ", yPos=" + yPos + '}';
    }

}
