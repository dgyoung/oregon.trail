package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;

/**
 *
 * @author Alexandra
 */
public class TestView extends View {

    public TestView() {
        super("**** TEST VIEW MENU *****\n"
                + "\n"
                + " 1)   Game Menu View \n"
                + " 2)   Help Menu View \n"
                + " 3)   Hunting View \n"
                + " 4)   Main Menu View \n"
                + " 5)   Map View \n"
                + " 6)   Name Select View \n"
                + " 7)   Select Occupation View \n"
                + " 8)   Set Pace View \n"
                + " 9)   Set Rations View \n"
                + " 10)  Start Existing Game View \n"
                + " 11)  Start Program View \n"
                + " 12)  Starting Month View \n"
                + " 13)  Store View \n"
                + " 14)  Supply View \n"
                + "\n***** What is your choice? *****\n");
    }

    @Override
    public boolean doAction(String inputs) {
        String choice;
        choice = inputs;
        Player player = GameControl.saveGame(choice);
        if (choice == null) {
            ErrorView.display(this.getClass().getName(),
                              "Plese enter a character");
            return false;
        }
        switch (choice) {
            
            case "1":
                this.gameMenuView();
                break;
            case "2":
                this.helpMenuView();
                break;
            case "3":
                this.huntingView();
                break;
            case "4":
                this.mainMenuView();
                break;
            case "5":
                this.mapView();
                break;
            case "6":
                this.nameSelectView();
                break;
            case "7":
                this.selectOccupationView();
                break;
            case "8":
                this.setPaceView();
                break;
            case "9":
                this.setRationsView();
                break;
            case "10":
                this.startExistingGameView();
                break;
            case "11":
                this.startProgramView();
                break;
            case "12":
                this.startingMonthView();
                break;
            case "13":
                this.storeView();
                break;
            case "14":
                //commented out until supplyView is fixed****
                //this.supplyView();
                break;
            case "15":
                this.endGameView();
            default:
                ErrorView.display(this.getClass().getName(),
                                  "Enter a valid option");

        }
        return false;
    }
    
    private void gameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
    private void helpMenuView() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
    private void huntingView() {
        HuntingView huntingView = new HuntingView();
        huntingView.display();
    }
    
    private void mainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
    private void mapView() {
        MapView mapView = new MapView();
        mapView.display();
    }
    private void nameSelectView() {
        NameSelectView nameSelectView = new NameSelectView();
        nameSelectView.displayNameSelectView();
    }

    private void selectOccupationView() {
        SelectOccupationView selectOccupationView = new SelectOccupationView();
        selectOccupationView.display();
    }
    
    private void setPaceView() {
        SetPaceView setPaceView = new SetPaceView();
        setPaceView.display();
    }
    
    private void setRationsView() {
        SetRationsView setRationsView = new SetRationsView();
        setRationsView.display();
    }
    
    private void startExistingGameView() {
        StartSavedGameView startExistingGameView = new StartSavedGameView();
        startExistingGameView.display();
    }
    
    private void startProgramView() {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }
    
    private void startingMonthView() {
        StartingMonthView startingMonthView = new StartingMonthView();
        startingMonthView.display();
    }
    
    private void storeView() {
        StoreView storeView = new StoreView();
        storeView.displayPurchaseItemsView();
    }
    
    
    //commented out until supplyView is fixed
    /*private void supplyView() {
        SupplyView supplyView = new SupplyView();
        supplyView.display();
    }*/

    private void endGameView() {
        EndGameView endGameView = new EndGameView();
        endGameView.display();
    }
    
}