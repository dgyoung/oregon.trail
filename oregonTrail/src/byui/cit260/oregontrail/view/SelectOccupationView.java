package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.control.SupplyControl;
import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class SelectOccupationView extends View{

    public SelectOccupationView() {
        super("********** The Oregon Trail **********\n"
                + "\n"
                + "     Many kinds of people made \n"
                + "         the trip to Oregon. \n"
                + "\n"
                + "* Choose your occupation: *\n"
                + "* 1. Banker from Boston *\n"
                + "* 2. Carpenter from Ohio *\n"
                + "* 3. Farmer from Illinois *\n"
                + "* 4. Which one should I choose? *\n"
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
        StoreView PurchaseItemsView
                = new StoreView();
        switch (choice) {
            case "1":
                GameControl.setCharacterChoice("Banker");
                SupplyControl.addToSupplies("money", 1600);
                PurchaseItemsView.displayPurchaseItemsView();
                return true;
            case "2":
                GameControl.setCharacterChoice("Carpenter");
                SupplyControl.addToSupplies("money", 800);
                PurchaseItemsView.displayPurchaseItemsView();
                return true;
            case "3":
                GameControl.setCharacterChoice("farmer");
                SupplyControl.addToSupplies("money", 400);
                PurchaseItemsView.displayPurchaseItemsView();
                return true;
            case "4":
                this.console.println("\nTraveling to Oregon isnt' easy!\n"
                        + "But if you're a banker, you'll have more money for\n"
                        + "supplies and services than a carpenter or a farmer.\n"
                        + "\n"
                        + "However, the harder you have to try the more points you deserve! \n"
                        + "Therefore, the farmer earns the greatest number of poinst and the banker earns the least.");
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                                  "Enter a valisd option");
        }
        return false;
    }

}
