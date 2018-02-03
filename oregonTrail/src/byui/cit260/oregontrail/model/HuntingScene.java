/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.util.ArrayList;

/**
 *
 * @author davey
 */
public enum HuntingScene{
   
    squirrel(2500, "Squirrel", 5, 10),
    buffalo(4000, "Buffalo", 5, 10),
    deer(3000, "Deer", 5, 10),
    rabbit(2500, "Rabbit", 5, 10),
    bear(3700, "Bear", 5, 10),
    elk(3200, "Elk", 5, 10);
    
    private int speed;
    private String animal;
    private int weight;
    private int varant;
    private ArrayList<SceneDescription> description = new ArrayList<SceneDescription>(1);


    public static HuntingScene getSquirrel() {
        return squirrel;
    }

    public static HuntingScene getBuffalo() {
        return buffalo;
    }

    public static HuntingScene getDeer() {
        return deer;
    }

    public static HuntingScene getRabbit() {
        return rabbit;
    }

    public static HuntingScene getBear() {
        return bear;
    }

    public static HuntingScene getElk() {
        return elk;
    }

    public int getSpeed() {
        return speed;
    }

    public String getAnimal() {
        return animal;
    }

    public int getWeight() {
        return weight;
    }

    public int getVarant() {
        return varant;
    }

    public ArrayList<SceneDescription> getDescription() {
        return description;
    }

    private HuntingScene(int speed, String animal, int weight, int varant) {
        this.speed = speed;
        this.animal = animal;
        this.weight = weight;
        this.varant = varant;
    }

    

    @Override
    public String toString() {
        return "HuntingScene{" + "speed=" + speed + ", animal=" + animal + ", weight=" + weight + ", varant=" + varant + '}';
    }
    
}
