/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author bradrallen
 */
public enum OccupationType {
    Banker ("Banker","Banker from Boston",1600.00),
    Carpenter("Carpenter","Carpenter from Ohio",800.00),
    Farmer("Farmer","Farmer from Illinois", 400.00);
    
    private String name;
    private String description;
    private double startMoney;

    OccupationType(String name, String description, double startMoney){
        this.name = name;
        this.description = description;
        this.startMoney = startMoney;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getStartMoney() {
        return startMoney;
    }

    @Override
    public String toString() {
        return "OccupationType{" + "name=" + name + ", description=" + description + ", startMoney=" + startMoney + '}';
    }
    
   
}
