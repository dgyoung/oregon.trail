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
                +"\n"       
                +"***** What is your choice? *****\n");
            
        }

        
        @Override
        public boolean doAction(String inputs) {

        String menuOption;
        menuOption = inputs;
        
        //Player player = GameControl.saveGame(menuOption);
        
        if (menuOption == null) {
            System.out.println("Please enter a valid menu option");

            return false;
        }    
        
        switch (menuOption) {
            case "1": //continue on trail
                System.out.println("\n***** This should take you back to the game... *****\n");
                break;
            case "2": //check supplies
                this.supplyView();
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
                System.out.println("\n***** How many days would you like to rest? *****\n");
                // TO INCREMENT THE DATE BY ONE DAY
                // calendar.add(Calendar.DATE, 1);
                // System.out.println("Date : " + sdf.format(calendar.getTime()));
                break;
            case "7": //hunt
                this.huntingView();
                break;
            case "8": //hunt
                System.out.println("\n" +
                "***** If the user chooses Print Report, they are taken to a new view that shows all of the available\n" +
                "reports to print. After choosing a report type, they enter the file location to save the report,\n" +
                "and then are taken back to the menu showing all of the available reports. After a report has\n" +
                "been written (printed) to a file, the user has the option to enter ‘C’ to continue and go back to\n" +
                "the Game Menu, or print another report. All valid inputs and error messages should be implemented. *****\n");
                break;
            default:
                System.out.println("Enter a valid option");

        }
        return false;
    }
             
    private void supplyView(){
        SupplyView supplyView = new SupplyView();
        supplyView.display();
    }
    
    private void mapView(){

        String leftIndicator;
        String rightIndicator;

        Game game = OregonTrail.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();

        System.out.print("  |");
        for (int column = 0; column < locations[0].length; column++) {

            System.out.print("   " + (column + 1) + "  |");
        }

        System.out.println();
        for (int row = 0; row < locations.length; row++) {
            System.out.print((row + 1) + " ");
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
                System.out.print("|");
                if (locations[row][column].getScene() == null) {

                    System.out.print(leftIndicator + "??" + rightIndicator);
                } else {
                    System.out.print(leftIndicator
                            + locations[row][column].getScene().getMapSymbol()
                            + rightIndicator);
                }
            }
            System.out.println("|");
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

}