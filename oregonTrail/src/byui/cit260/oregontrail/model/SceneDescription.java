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
 * @author davey
 */
public enum SceneDescription implements Serializable{
    storeScene("This is how store scene works"),
    riverScene("This is how river scene works"),
    huntingScene("This is how hunting scene works");
    
    private String description;
    private ArrayList<Location> location = new ArrayList<Location>();


    private SceneDescription(String description) {
        this.description = description;
    }

    public static SceneDescription getStoreScene() {
        return storeScene;
    }

    public static SceneDescription getRiverScene() {
        return riverScene;
    }

    public static SceneDescription getHuntingScene() {
        return huntingScene;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Location> getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "SceneDescription{" + "description=" + description + '}';
    }

    public class store1 {

        public store1() {
        }
    }
    
    
}
