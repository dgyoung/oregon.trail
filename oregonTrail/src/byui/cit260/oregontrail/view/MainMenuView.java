package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import static byui.cit260.oregontrail.control.GameControl.restoreSavedGame;
import static byui.cit260.oregontrail.control.GameControl.startNewGame;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.orgontrail.exceptions.GameControlException;
import byui.cit260.orgontrail.exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexandra
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("**** The Oregon Trail – MAIN MENU *****\n"
                + "\n"
                + "* 1. Start New Game *\n"
                + "* 2. Resume Saved Game *\n"
                + "* 3. Help *\n"
                + "* 4. Save Game *\n"
                + "* Q. Exit *\n"
                + "* 6. Test View *\n"
                + "\n***** What is your choice? *****\n");
    }
    @Override
    public boolean doAction(String inputs) {
//playersName = get the first value in the inputs array
        String choice;
        choice = inputs;
        //player = savePlayer(playersName)
        Player player = GameControl.saveGame(choice);
        //IF player == null
        if (choice == null) {
            ErrorView.display(this.getClass().getName(), "Plese enter a valid option");
            return false;
        }
        switch (choice) {
            case "1":
                {
                  try {
                    GameControl.startNewGame();
                  } catch (GameControlException ex) {
                  ErrorView.display(this.getClass().getName(), ex.getMessage());
                  }
                }
                this.nameSelectView();
                break;
            case "2":
                this.startExistingGameView();
                break;
            case "3":
                this.helpMenuView();
                break;
            case "4":
                this.saveGame();
                break;
            case "6":
                this.testView();
                break;
            default:
                System.out.println("Enter a valid option");

        }
        return false;
    }
    
    private void nameSelectView() {
        NameSelectView newgameMenuView = new NameSelectView();
        newgameMenuView.displayNameSelectView();   
    }
    
    private void startExistingGameView() { 
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display();
    }
    
    private void helpMenuView() { 
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
    private void testView() { 
        TestView testView = new TestView();
        testView.display();
    }

  private void saveGame() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
    
}