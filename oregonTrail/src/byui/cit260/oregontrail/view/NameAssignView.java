/*
 * created by Brad R. Allen
 */
package byui.cit260.oregontrail.view;
import byui.cit260.oregontrail.model.Character;
import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.orgontrail.exceptions.GameControlException;
import byui.cit260.oregontrail.control.CharacterControl;
import static byui.cit260.oregontrail.control.CharacterControl.createNewCharacter;
import oregontrail.OregonTrail;


/**
 *
 * @author bradrallen
 */
public class NameAssignView extends View {

  public NameAssignView() {
    super(
          "Please enter their first name, one name at a time:"
    );
  }
  @Override
      public boolean doAction(String inputs) {
        String characterName;
        characterName = inputs;
        Game game = OregonTrail.getCurrentGame();
        int characterCount = game.getNoPeople();
        if (characterName == null) {
            ErrorView.display(this.getClass().getName(),"Enter a name.");
        } else if(characterCount <4) {
              game.setNoPeople(characterCount + 1);
              this.addCharacter(characterName);
              this.console.println("\n"
                    +characterName +" has been added to your wagon.\n"
              );
        }else{
            //should be the 5th character so increment the number of people one last time and get out
            game.setNoPeople(characterCount + 1);
            this.addCharacter(characterName);
            StartingMonthView StartingMonthView = new StartingMonthView();
            StartingMonthView.display();
        }
        return false;
      }

  private void addCharacter(String name) {
    try{
      createNewCharacter(name);
    }catch (GameControlException ex){
      ErrorView.display(this.getClass().getName(), "Create Character Failed");
    }
  }
  
}
