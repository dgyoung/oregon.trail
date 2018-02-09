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
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        playerOne.setName("Jim Brider");
        playerOne.setOccupation(OccupationType.Carpenter);
        System.out.println(playerOne.toString());
        
        Wagon wagonOne = new Wagon();
        System.out.println(wagonOne.toString());
  
        Game currentGame = new Game();
        currentGame.setElapsedDays(0);
        //temp path for testing
        String path = "/Users/bradrallen/Documents/oregon_trail_game01.xml";
        currentGame.setGameFilePath(path);
        currentGame.setNoAlive(5);
        currentGame.setPlayer(playerOne);
        currentGame.setStartMonth("May");
        //need to creat an enum class to choose months from
        System.out.println(currentGame.toString());
        
        Actor.BigLouie.getName();
        Actor.BigLouie.getDescription();
        Actor.BigLouie.getLandmark();
        System.out.println(Actor.BigLouie.toString());
        System.out.println(RationsType.BareBones.toString());
        System.out.println(PaceType.Grueling.toString());
        System.out.println(OccupationType.Farmer.toString());
    }
    
}
