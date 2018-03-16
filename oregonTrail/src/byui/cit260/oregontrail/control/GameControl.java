package byui.cit260.oregontrail.control;

import static byui.cit260.oregontrail.control.MapControl.createMap;
import byui.cit260.oregontrail.model.Character;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Player;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import oregontrail.OregonTrail;


public class GameControl {
    public static void startNewGame() {
      int returnValue = GameControl.createNewGame(OregonTrail.getPlayer());
      if (returnValue <0){
        System.out.println("Error - Failed to create new game");
      }
    }
    public static int createNewGame(Player player){
      if (player == null){
        return -1;
      }
      //      game = create a new Game object
      Game game = new Game();
      
    //Save a reference to the Player object in the game
      game.setPlayer(player);
      
    //Save a reference to the game in the main class
    OregonTrail.setCurrentGame(game);
    
    //actors = createActors()
    //Save the list of actors in the Game object
    game.setNoPeople(5);
    
    //Assign an actor to the player
   
    //Save the list of items in the game
    
    //map = createMap(noOfRows, noOfColumns, items)
    MapControl.createMap();
    return 1;
    
    //game.setMap(map); we can't do this yet
    //items = createItems()

    }


    public static Player saveGame(String playersName) {
        //savePlayer(name): Player
        //BEGIN
            //if name is null OR length of name is < 1 THEN
            if (playersName == null || playersName.length() < 1) {
                return null;
            }
       
            //player = new Player object
            Player player = new Player();
            //save the name in the player object
            player.setName(playersName);
            //save the player in the main class of the project
            OregonTrail.setPlayer(player);
   
        return new Player();
}

    public static void restoreSavedGame() {
        System.out.println("*** restoreSavedGame called ***");
    }
    //public static InventoryItem[] createItems(){
   //       System.out.println("*** InventoryItem called ***");

   // }
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
        
        System.out.println("supply: " + supply
        + "\nbonus: " + bonus
        + "\ncharacter: " + character
        + "\nfinalScore: " + finalScore
        + "\ntotalHealth: " + totalHealth);
        return finalScore;

    }


    public static boolean setCharactersNames(String name) {
        Character character = new Character();
        character.setName(name);
        return true;
        
    }
    
    public static Game setCharacterChoice(String choice) {
        Game game = new Game();
        game.setCharacterChoice(choice);
        return game;
        
    }

    public static Calendar setCalendar() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMM dd yyyy");
        Calendar calendar = new GregorianCalendar();
        sdf.format(calendar.getTime());
        return calendar;
    }
    
    public static String getCalendar() {
        return "";
    }
    
}