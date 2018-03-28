/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Lane
 */
public class Map implements Serializable{
    
    public Map() {
    }
    
    public Map(int numOfRows, int numOfColumns) {
        if(numOfRows <1 || numOfColumns <1){
            return;
        }
        this.rowCount = numOfRows;
        this.colCount = numOfColumns;
        this.currentRow = 0;
        this.currentColumn = 0;
        
        this.locations = new Location[numOfRows][numOfColumns];
        
        for(int row = 0; row<numOfRows; row++){
            for(int column = 0; column<numOfColumns; column++){
                Location location = new Location();
                location.setxPos(column);
                location.setyPos(row);
                
                locations[row][column] = location;
            }
        }
    }
    private Location[][] locations;      
    private int rowCount;
    private int colCount;
    private int currentRow;
    private int currentColumn;
    private String currentScene;
    private Scene scenes[];

    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }
    
    public Location getCurrentLocation(){
        return locations[currentRow][currentColumn];
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    public String getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(String currentScene) {
        this.currentScene = currentScene;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.rowCount;
        hash = 31 * hash + this.colCount;
        hash = 31 * hash + this.currentRow;
        hash = 31 * hash + this.currentColumn;
        hash = 31 * hash + Objects.hashCode(this.currentScene);
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (!Objects.equals(this.currentScene, other.currentScene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", currentScene=" + currentScene + '}';
    }

}