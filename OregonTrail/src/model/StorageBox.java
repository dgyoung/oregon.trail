/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
/**
 *
 * @author MasterCraft Computer
 */
public class StorageBox implements Serializable
{
    private double height;
    private double width;
    private double depth;
    private double volume;
    private double maxWeight;

    public StorageBox()
    {

    }

    public StorageBox(double height, double width, double depth, double volume, double maxWeight)
    {
    this.height = height;
    this.width = width;
    this.depth = depth;
    this.volume = volume;
    this.maxWeight = maxWeight;
    }

    public double getWidth() 
    {
    return width;
    }
    public void setWidth(double width) 
    {
    this.width = width;
    }

    public double getDepth() 
    {
    return depth;
    }
    public void setDepth(double depth) 
    {
    this.depth = depth;
    }

    public double getMaxWeight() 
    {
    return maxWeight;
    }
    public void setMaxWeight(double maxWeight) 
    {
    this.maxWeight = maxWeight;
    }

    public double getHeight()
    {
    return height;
    }
    public void setHeight(double height)
    {
    this.height = height;
    } 

    public double getVolume()
    {
    return volume;
    }
    public void setVolume(double volume)
    {
    this.volume = volume;
    }


}