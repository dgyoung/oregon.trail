/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bradrallen
 */
public enum PaceType {
    
    Steady("Steady","You travel about 8 hours a day, taking frequent rests. "
            + "You take care not to get too tired."),
    Strenuous("Strenuous","You travel about 12 hour a day, starting just after "
            + "sunrise and stopping shortly before sunset. You stop to rest only"
            + " when necessary. You finish each day feeling very tired."),
    Grueling("Grueling","You travel about 16 hours a day, starting before "
            + "sunrise and continuing until dark. You almost never stop to rest."
            + " You do not get enough sleep at night. You finish each day "
            + "feeling absolutely exhausted, and your health suffers.");
    
    private String name;
    private String description;

    PaceType (String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "PaceType{" + "name=" + name + ", description=" + description + '}';
    }
    
}
