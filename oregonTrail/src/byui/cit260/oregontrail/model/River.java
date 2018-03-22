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
public enum River implements Serializable{
    //if ferry cost is 0 then there is no ferry
    kansasRiver(10,4,100),
    bigBlueRiver(0,3,60),
    greenRiver(15,6,100),
    snakeRiver(10, 8, 200),
    columbiaRiver(20, 5, 30);
    
    private int ferryCost;
    private int depth;
    private int width;
    private String name;  
    private int riverID;
    private ArrayList<SceneDescription> description = new ArrayList<SceneDescription>(1);
      
    private River(int ferryCost, int depth, int width) {
        this.ferryCost = ferryCost;
        this.depth = depth;
        this.width = width;
    }
    
    public ArrayList<SceneDescription> getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "RiverScene{" + "ferryCost=" + ferryCost + ", depth=" + depth + ", width=" + width + ", name=" + name + ", riverID=" + riverID + ", description=" + description + '}';
    }
    
}
