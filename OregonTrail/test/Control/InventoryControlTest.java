/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MasterCraft Computer
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcVolumeOfStorageBox method, of class InventoryControl.
     */
    @Test
    public void testCalcVolumeOfStorageBox() {
        System.out.println("calcVolumeOfStorageBox");
        System.out.println("/tTest Case 1");
        double height = 2.0;
        double width = 1.0;
        double depth = 3.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 6.0;
        double result = instance.calcVolumeOfStorageBox(height, width, depth);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void test2CalcVolumeOfStorageBox() {
        System.out.println("calcVolumeOfStorageBox");
        System.out.println("/tTest Case 2");
        double height = -1.0;
        double width = 2.0;
        double depth = 1.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcVolumeOfStorageBox(height, width, depth);
        assertEquals(expResult, result, 0.0001);
    
    }
     @Test
    public void test3CalcVolumeOfStorageBox() {
        System.out.println("calcVolumeOfStorageBox");
        System.out.println("/tTest Case 3");
        double height = 2.0;
        double width = -1.0;
        double depth = 2.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcVolumeOfStorageBox(height, width, depth);
        assertEquals(expResult, result, 0.0001);
    }
     @Test
    public void test4CalcVolumeOfStorageBox() {
        System.out.println("calcVolumeOfStorageBox");
        System.out.println("/tTest Case 4");
        double height = 4.0;
        double width = 3.0;
        double depth = 2.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcVolumeOfStorageBox(height, width, depth);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void test5CalcVolumeOfStorageBox() {
        System.out.println("calcVolumeOfStorageBox");
        System.out.println("/tTest Case 5");
        double height = 3.0;
        double width = 3.0;
        double depth = 3.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 27.0;
        double result = instance.calcVolumeOfStorageBox(height, width, depth);
        assertEquals(expResult, result, 0.0001);
    }
     @Test
    public void test6CalcVolumeOfStorageBox() {
        System.out.println("calcVolumeOfStorageBox");
        System.out.println("/tTest Case 6");
        double height = 1.0;
        double width = 1.0;
        double depth = 1.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 1.0;
        double result = instance.calcVolumeOfStorageBox(height, width, depth);
        assertEquals(expResult, result, 0.0001);
    }
}
