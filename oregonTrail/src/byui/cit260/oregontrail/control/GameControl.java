/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.oregontrail.model.Supplies;
import byui.cit260.oregontrail.model.Character;

/**
 *
 * @author David
 */
public class GameControl {

    public static void startNewGame() {
    }

    public static void saveGame() {

    }

    public static void restoreSavedGame() {

    }

    public static int getFinalScore(int supply, int bonus, int character) {
        int finalScore;
        int totalHealth = character;
        if (totalHealth <= 0 || totalHealth > 15){
        
		return -1;
        }
        
        if (supply < 0) {
            return -1;
        }
        if (bonus < 1 || bonus > 3) {
            return -1;
        }
        finalScore = ((totalHealth * 200) + supply) * bonus;
        return finalScore;

    }

    public static void initializeMap() {

    }

    public static boolean setCharactersNames(String name) {
        Character character = new Character();
        character.setName(name);
        return true;
        
    }
}
