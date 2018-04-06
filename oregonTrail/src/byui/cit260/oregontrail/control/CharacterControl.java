/*
 * created by Brad R. Allen
 */
package byui.cit260.oregontrail.control;
import byui.cit260.oregontrail.model.Character;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Wagon;
import oregontrail.OregonTrail;



import byui.cit260.orgontrail.exceptions.GameControlException;
import java.util.ArrayList;

/**
 *
 * @author bradrallen
 */
public class CharacterControl {
  
    public static void createNewCharacter(String characterName) throws GameControlException {
        //make new character
        Character character = new Character();
        //assing name to character
        character.setName(characterName);
        
        //get current game so that we can get the wagon
        Game game = OregonTrail.getCurrentGame();
        //get the wagon so that we can get the ArrayList of characters
        Wagon wagon = game.getWagon();
        //get the ArrayList
        ArrayList<Character> characters = wagon.getCharacters();
        //add new character to the list
        characters.add(character);
        //assign the updated list back to the wagon
        wagon.setCharacters(characters);
    }
}
