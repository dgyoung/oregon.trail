package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.orgontrail.exceptions.GameControlException;


public class MainMenuView extends View {

    public MainMenuView() {
        super("**** The Oregon Trail – MAIN MENU *****\n"
                + "\n"
                + "* 1. Start New Game *\n"
                + "* 2. Resume Saved Game *\n"
                + "* 3. Help *\n"
                + "* Q Exit *\n"
                + "* T Test View *\n"
                + "\n***** What is your choice? *****\n");
    }
    @Override
    public boolean doAction(String inputs) {
        String choice;
        choice = inputs;
        Player player = GameControl.saveGame(choice);
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
            case "T": case "t" :
                this.testView();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                                  "Enter a valid option");

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
