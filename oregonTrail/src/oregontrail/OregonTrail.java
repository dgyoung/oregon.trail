/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.RiverScene;

/**
 *
 * @author davey
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Game game1 = new Game();
         game1.setNoPeople(10);
         game1.setTotalDays(4040);
         System.out.println(game1.toString());
         System.out.print(game1.getNoPeople() + " ");
         System.out.println(game1.getTotalDays());
         
         RiverScene.Columbia.getFerryCost();
         System.out.print(RiverScene.Columbia.getDepth() + " $");
         System.out.println(RiverScene.Columbia.getFerryCost());
    }
    
}
