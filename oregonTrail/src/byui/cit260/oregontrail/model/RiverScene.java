/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

/**
 *
 * @author davey
 */
public enum RiverScene {
    
    
    SouthPlate(50, 3, 10, "South Plate River"),
    Snake(200, 82, 500, "Snake River"),
    Columbia(200, 50, 30, "Columbia River"),
    Missouri(50, 44, 18, "Missouri River");    
    
    
    public int ferryCost;
    public int depth;
    public int width;
    public String name;

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

    RiverScene(int ferryCost, int depth, int width, String name) {
        this.ferryCost = ferryCost;
        this.depth = depth;
        this.width = width;
        this.name = name;
    }

    

    @Override
    public String toString() {
        return "RiverScene{" + "ferryCost=" + ferryCost + ", depth=" + depth + ", width=" + width + ", name=" + name + '}';
    }
    
    
}
