package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.control.WagonControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import oregontrail.OregonTrail;
/**
 *
 * @author Allie
 */
public class GameMenuView extends View{
    
    public GameMenuView(){
               
        super("\n***** The Oregon Trail *****\n"
                + "* Location: + Location.getLocation() *\n"
                + "* Date: " + GameControl.getCalendar() + "*\n"
                + "* Health: " + WagonControl.getWagonHealth() + "*\n"
                + "* Pace: " + WagonControl.getWagonPace() + "*\n"
                + "* Rations: " + WagonControl.getWagonRations() + "*\n"
                + "\n"
                + "* 1. Continue on trail *\n"
                + "* 2. Check supplies *\n"
                + "* 3. Display the map *\n"
                + "* 4. Change pace *\n"
                + "* 5. Change food rations *\n"
                + "* 6. Stop to rest *\n"
                + "* 7. Hunt *\n"
                + "* 8. Print Report *\n"
                + "* 9. Save Game *\n"
                +"\n"       
                +"***** What is your choice? *****\n");
            
        }

        
        @Override
        public boolean doAction(String inputs) {

        String menuOption;
        menuOption = inputs;
                
        if (menuOption == null) {
            ErrorView.display(this.getClass().getName(),
                              "Please enter a valid menu option");
            return false;
        }    
        
        switch (menuOption) {
            case "1": //continue on trail
                this.console.println("\n***** This should take you back to the game... *****\n");
                break;
            case "2": //check supplies
                //commented out until supplyView is fixed****
                //this.supplyView();
                break;
            case "3": //display map
                this.mapView();
                break;
            case "4": //change pace
                this.setPaceView();
                break;
            case "5": //change food rations
                this.setRationsView();
                break;
            case "6": //stop to rest
                this.console.println("\n***** How many days would you like to rest? *****\n");
                // TO INCREMENT THE DATE BY ONE DAY
                // calendar.add(Calendar.DATE, 1);
                // this.console.println("Date : " + sdf.format(calendar.getTime()));
                break;
            case "7": //hunt
                this.huntingView();
                break;
            case "8": //print report
                this.reportView();
                break;
            case "9": //save game 
                this.saveGame();
            default:
                ErrorView.display(this.getClass().getName(),
                                  "Enter a valid option");
        }
        return false;
    }
             
    /*private void supplyView(){
        SupplyView supplyView = new SupplyView();
        supplyView.display();
    }*/
    
    private void mapView(){

        String leftIndicator;
        String rightIndicator;

        Game game = OregonTrail.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();

        this.console.print("  |");
        for (int column = 0; column < locations[0].length; column++) {

            this.console.print("   " + (column + 1) + "  |");
        }

        this.console.println();
        for (int row = 0; row < locations.length; row++) {
            this.console.print((row + 1) + " ");
            for (int column = 0; column < locations[row].length; column++) {

                leftIndicator = " ";
                rightIndicator = " ";
                if (locations[row][column] == map.getCurrentLocation()) {

                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (locations[row][column].Visited()) {

                    leftIndicator = ">";
                    rightIndicator = "<";
                } else if (locations[row][column].isStart()) {
                    leftIndicator = ";";
                    rightIndicator = ";";
                }
                this.console.print("|");
                if (locations[row][column].getScene() == null) {

                    this.console.print(leftIndicator + "??" + rightIndicator);
                } else {
                    this.console.print(leftIndicator
                            + locations[row][column].getScene().getMapSymbol()
                            + rightIndicator);
                }
            }
            this.console.println("|");
        }
        OregonTrail.pressAnyKeyToContinue();
    }
    
    private void setPaceView(){
        SetPaceView setPaceView = new SetPaceView();
        setPaceView.display();
    }
    
    private void setRationsView(){
        SetRationsView setRationsView = new SetRationsView();
        setRationsView.display();
    }
        
    private void huntingView(){
        HuntingView huntView = new HuntingView();
        huntView.display();
    }
    private void saveGame() {
      SaveGameView saveGameView = new SaveGameView();
      saveGameView.display();
    }

  private void reportView() {
    ReportView reportView = new ReportView();
    reportView.display();
  }
}
