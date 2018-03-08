/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author team
 */
public enum RiverScene implements Serializable{
    
    
    SouthPlate(50, 3, 10, "South Plate River", 1),
    Snake(200, 82, 500, "Snake River", 2),
    Columbia(200, 50, 30, "Columbia River", 3),
    Missouri(50, 44, 18, "Missouri River", 4);    
    
    
    private int ferryCost;
    private int depth;
    private int width;
    private String name;  
    private int riverID;
    private ArrayList<SceneDescription> description = new ArrayList<SceneDescription>(1);
  

    public static RiverScene getSouthPlate() {
        return SouthPlate;
    }

    public static RiverScene getSnake() {
        return Snake;
    }

    public static RiverScene getColumbia() {
        return Columbia;
    }

    public static RiverScene getMissouri() {
        return Missouri;
    }

    public ArrayList<SceneDescription> getDescription() {
        return description;
    }

    public int getRiverID() {
        return riverID;
    }
    

    public int getFerryCost() {
        return ferryCost;
    }

    public int getDepth() {
        return depth;
    }

    public int getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }

    private RiverScene(int ferryCost, int depth, int width, String name, int riverID) {
        this.ferryCost = ferryCost;
        this.depth = depth;
        this.width = width;
        this.name = name;
        this.riverID = riverID;
    }

    @Override
    public String toString() {
        return "RiverScene{" + "ferryCost=" + ferryCost + ", depth=" + depth + ", width=" + width + ", name=" + name + ", riverID=" + riverID + ", description=" + description + '}';
    }

    

    
    
}
