/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

/**
 *
 * @author MasterCraft Computer
 */
public enum Actor
{
    Bob("Bob", "He runs the General Store.", "General Store"),
    BigLouie("Big Louie", "He is a trail Driver", "Big Blue River");
    
    
    private String name;
    private String description;
    private String landmark;

Actor(String name, String description, String landmark)
{
    this.name = name;
    this.description = description;
    this.landmark = landmark;
}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLandmark() {
        return landmark;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + 
                ", description=" + description + 
                ", landmark=" + landmark + '}';
    }



}