/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MasterCraft Computer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) 
    {
        Player playerOne = new Player();
        
        playerOne.setName("Bob");
        playerOne.setOccupation("General Store Manager");
        
        String PlayerOneName = playerOne.getName();
        String PlayerOneOccupation = playerOne.getOccupation();
        
        System.out.println(playerOne.toString());
        Actor.Bob.getName();
        Actor.Bob.getDescription();
        System.out.println(Actor.Bob);
        System.out.println(Game.class);
        System.out.println(Player.class);
    }
    
}
