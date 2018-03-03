/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import control.GameControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bradrallen
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of scoreGame method, of class GameControl.
     */
    @Test
    public void testScoreGame() {
        System.out.println("scoreGame");
        System.out.println("\t Test Case 1 - all valid");
        //all valid
        double[] trekers = {0, 1, 8, 9, 9} ;//sum=27
        double mileMarker = 2000;
        double[] remainingResources = {50, 50, 25, 25, 50, 10} ;//sum = 210
        String occupation = "carpenter";
        GameControl instance = new GameControl();
        double expResult = 474;
        double result = instance.scoreGame(trekers, mileMarker, remainingResources, occupation);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testScoreGame2() {
        System.out.println("\t Test Case 2 - error everyone is dead");
        //-1 because everyone is dead
        double[] trekers = {0, 0, 0, 0, 0} ;//sum=0
        double mileMarker = 2000;
        double[] remainingResources = {50, 50, 25, 25, 50, 10} ;//sum = 210
        String occupation = "carpenter";
        GameControl instance = new GameControl();
        double expResult = -1;
        double result = instance.scoreGame(trekers, mileMarker, remainingResources, occupation);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testScoreGame3() {
        System.out.println("\t Test Case 3 - error not at end of trail");
        //-1 not at end of trail
        double[] trekers = {0, 1, 8, 9, 9} ;//sum=27
        double mileMarker = 1800;
        double[] remainingResources = {50, 50, 25, 25, 50, 10} ;//sum = 210
        String occupation = "carpenter";
        GameControl instance = new GameControl();
        double expResult = -1;
        double result = instance.scoreGame(trekers, mileMarker, remainingResources, occupation);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testScoreGame4() {
        System.out.println("\t Test Case 4 - error bad occupation");
        //-1 bad occupation
        double[] trekers = {0, 1, 8, 9, 9} ;//sum=27
        double mileMarker = 2000;
        double[] remainingResources = {50, 50, 25, 25, 50, 10} ;//sum = 210
        String occupation = "nosuchthing";
        GameControl instance = new GameControl();
        double expResult = -1;
        double result = instance.scoreGame(trekers, mileMarker, remainingResources, occupation);
        assertEquals(expResult, result, 0.0);
    }
}
