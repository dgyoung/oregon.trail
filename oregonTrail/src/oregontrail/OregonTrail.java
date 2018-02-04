/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.HuntingScene;
import byui.cit260.oregontrail.model.RiverScene;
import byui.cit260.oregontrail.model.SceneDescription;
import byui.cit260.oregontrail.model.StoreScene;
import byui.cit260.oregontrail.model.Character;
import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Location;

/**
 *
 * @author davey, allie, &
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
         System.out.println(HuntingScene.bear.toString() + " \n" + 
                 HuntingScene.elk.toString() + " \n" + 
                 HuntingScene.squirrel.toString() + " \n" + 
                 HuntingScene.buffalo.toString() + " \n" + 
                 HuntingScene.rabbit.toString() + " \n" + 
                 HuntingScene.deer.toString());
         System.out.println(SceneDescription.huntingScene.toString() + " \n" +
                 SceneDescription.riverScene.toString() + " \n" +
                 SceneDescription.storeScene.toString());
         System.out.println(StoreScene.store1.toString() + " \n" +
                 StoreScene.store2.toString() + " \n" +
                 StoreScene.store3.toString() + " \n" +
                 StoreScene.store4.toString() + " \n" +
                 StoreScene.store5.toString());
        
        Character character1 = new Character();
        character1.setName("Kolob");
        character1.setAffliction("Cholera");
        System.out.println(character1.toString());
        
        Wagon wagon1 = new Wagon();
        wagon1.setPace(3);
        wagon1.setRations("Meager");
        System.out.println(wagon1.toString());
        
        Map map1 = new Map();
        map1.setPathChoice("Whichever has the most snakes?");
        map1.setCheckpoint("You've reached the Trading Post in Missouri");
        System.out.println(map1.toString());
        
        Location location1 = new Location();
        location1.setLabel("OREGON!");
        location1.setNext(235);
        location1.setPosition(564);
        location1.setEnd(36);
        location1.setWeather("Monsoon");
        System.out.println(location1.toString());
       
    }
    
}