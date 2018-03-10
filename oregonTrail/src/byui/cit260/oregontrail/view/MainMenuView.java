package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import static byui.cit260.oregontrail.control.GameControl.restoreSavedGame;
import static byui.cit260.oregontrail.control.GameControl.startNewGame;
import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;

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
                + "* 4. Test View *\n"
                + "* 5. Exit *\n"
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
            System.out.println("Plese enter a valid option");

            return false;
        }
        switch (choice) {
            case "1":
                this.nameSelectView();
                break;
            case "2":
                this.startExistingGameView();
                break;
            case "3":
                this.helpMenuView();
                break;
            case "4":
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
    
}