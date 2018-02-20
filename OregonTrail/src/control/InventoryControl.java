/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.StorageBox;

/**
 *
 * @author MasterCraft Computer
 */
public class InventoryControl 
{
public double calcVolumeOfStorageBox(double height, double width, double depth)  
    {
    if (height < 0 || height > 3)
    {
        return -1;
    }
    if (width < 0 || width > 3)
    {
        return -1;
    }
    if (depth < 0 || depth > 3)
    {
        return -1;
        
    }
    
    double volume = (height * width * depth);
    return volume;
    
    }

}
