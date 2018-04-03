package byui.cit260.oregontrail.control;

import static byui.cit260.oregontrail.control.MapControl.createMap;
import byui.cit260.oregontrail.model.Character;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.orgontrail.exceptions.GameControlException;
import byui.cit260.orgontrail.exceptions.MapControlException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import oregontrail.OregonTrail;

public class GameControl {

    public static void startNewGame() throws GameControlException {
      GameControl.createNewGame(OregonTrail.getPlayer());

    }

    public static void createNewGame(Player player) throws GameControlException {
        if (player == null) {
          throw new GameControlException("ERROR: Player Object Required");
        }
        // game = create a new Game object
        Game game = new Game();

        //Save a reference to the game in the main class
        OregonTrail.setCurrentGame(game);

        //Save a reference to the Player object in the game
        game.setPlayer(player);

        //game starts with 5 people in the wagon
        game.setNoPeople(5);

        //call create map
        Map map = MapControl.createMap(10,20);
   
        //set reference to map in the game
        game.setMap(map);

        //create wagon
        Wagon wagon = WagonControl.createWagon();

        //set reference to wagon in the game
        game.setWagon(wagon);
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
    
    public static void saveGameFile(Game game, String filePath) throws GameControlException, IOException {
      if (game == null || filePath == null) {
        throw new GameControlException("Invalid Game or File Path");
      }
      
      try (ObjectOutputStream out = new
          ObjectOutputStream(new FileOutputStream(filePath))){
          out.writeObject(game);
      } catch (IOException ex) {
        System.out.println("I/O Error: " + ex.getMessage());
      }
      System.out.println("saveGame() in GameControl class");
    }

    public static void restoreSavedGame() {
        System.out.println("*** restoreSavedGame called ***");
    }
    //public static InventoryItem[] createItems(){
    //       System.out.println("*** InventoryItem called ***");

    // }
    public static int getFinalScore(int supply, int bonus, int character)
            throws GameControlException {
        int finalScore;
        int totalHealth = character;
        if (totalHealth <= 0 || totalHealth > 15) {
            throw new GameControlException("Invalid health amount");
        }

        if (supply < 0) {
            throw new GameControlException("Cant have less than 0 supplies");
        }
        if (bonus < 1 || bonus > 3) {
            throw new GameControlException("invalid bonus");
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
        //Game game = new Game(); ? we don't want a new game, rather we need to attach the character to the current game
        Game game = OregonTrail.getCurrentGame();
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
    public static Game getGame(String filePath) throws GameControlException, IOException, ClassNotFoundException {
      if (filePath == null || filePath.length()<1 ){
        throw new GameControlException("Invalid File Path");
      }
      Game game = null;
      try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))){
         game = (Game)in.readObject();
         OregonTrail.setCurrentGame(game);
         Player player = game.getPlayer();
         OregonTrail.setPlayer(player);
      } catch ( IOException | ClassNotFoundException ex){
        System.out.println("Error Loading Saved File:" + ex.getMessage());
      }
      return game;

    }

}
