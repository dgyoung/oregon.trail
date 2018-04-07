/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import static byui.cit260.oregontrail.control.GameControl.getFinalScore;
import byui.cit260.oregontrail.control.SupplyControl;
import byui.cit260.oregontrail.model.Order;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.StoreScene;
import static byui.cit260.oregontrail.model.StoreScene.store1;
import byui.cit260.oregontrail.model.Supplies;
import byui.cit260.orgontrail.exceptions.GameControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class StoreView extends View{
    
    public StoreView(){
        super("");
    }

    void displayPurchaseItemsView() {
        this.console.println("\n"
                + "***** The Oregon Trail – " + store1.getStoreName() + " *****\n" //There is only one store in the game. ***** The Oregon Trail – Matt’s General Store *****
                + "\n" //There are trading posts/opportunities along the trail, but they don't work like this scene.
                + "* Item Name Price *\n"
                + "* 1. Oxen $" + store1.getOxenCost() + "\n"
                + "* 2. Food $" + store1.getFoodCost() + "\n"
                + "* 3. Clothing $" + store1.getClothingCost() + "\n"
                + "* 4. Ammunition $" + store1.getAmmoCost() + "\n"
                + "* 5. Wagon Wheel $" + store1.getWheelCost() + "\n"
                + "* 6. Wagon Axel $" + store1.getAxelCost() + "\n"
                + "* 7. Wagon Tonuge $" + store1.getTongueCost() + "\n"
                + "* Total Bill $0 *\n"
                + "* Total Funds Remaining $" + Supplies.getMoney() + "\n"
                + "* Funds Spent $" + store1.getSpent() + " *\n"
                + "********************************************\n"
                + "***** If you are finished enter \"8\" *****\n");

        boolean endOfView = false;
        String[] inputs = this.getInputs();

        do {
            if (inputs[0].toUpperCase().equals("Q")) {
                return; //exits program
            }
            //ENDIF endOfView = doAction(inputs)
            endOfView = this.doAction(inputs[0]);

        } while (!endOfView); //WHILE endOfView != true ;

    }

    private String[] getInputs() {

        String[] inputs = new String[1];

        Scanner scanner = new Scanner(System.in);
        String userInput = null;
        String trimmedUserInput = null;
        boolean valid = false;
        while (!valid) {

            userInput = scanner.nextLine();
            trimmedUserInput = userInput.trim();

            if (trimmedUserInput.length() < 1) {
                this.console.println("You must enter a non-blank value");
            } else {
                inputs[0] = trimmedUserInput;
                valid = true;
            }
        }
        this.console.println("***** Choose an item to add to your order: *****");

        return inputs;
    }

    @Override
    public boolean doAction(String inputs) {
        Order order = new Order();
        String choice;
        choice = inputs;
        //IF player == null
        if (choice == null) {
            this.console.println("Plese enter a character");

            return false;
        }
        String inputs2;
        String[] number;
        int item = 0;
        StoreView PurchaseItemsView = new StoreView();
        switch (choice) {
            case "1":
                this.console.println("There are 2 oxen in a yoke; I recommend at least 3 yoke. I charge $40 a yoke.\n"
                        + "***** How many yoke would you like to buy? *****");
                try {
                    number = this.getInputs();
                    inputs2 = number[0];
                    item = Integer.parseInt(inputs2);

                    //continue on trail
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                    this.console.println("Please enter a number");
                }
                 {
                    try {
                        SupplyControl.addToSupplies("oxen", item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 {
                    try {
                        SupplyControl.removeFromSupplies("money", store1.getOxenCost() * item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 PurchaseItemsView.displayPurchaseItemsView();
                break;
            case "2":
                this.console.println("\n"
                        + "I recommend you take at least 200 pounds of food for each person in your family.\n"
                        + " I see that you have 5 people in all. You'll need flour, sugar, bacon, and herbal tea.\n"
                        + "My price is 20 cents a pound.\n"
                        + "***** How many pounds would you like to buy? *****");
                try {
                    number = this.getInputs();
                    inputs2 = number[0];
                    item = Integer.parseInt(inputs2);

                    //continue on trail
                    item = Integer.parseInt(inputs2);
                } catch (NumberFormatException ex) {
                    Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                }
                 {
                    try {
                        SupplyControl.addToSupplies("food", item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 {
                    try {
                        SupplyControl.removeFromSupplies("money", store1.getFoodCost() * item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 PurchaseItemsView.displayPurchaseItemsView();
                break;
            case "3":
                this.console.println("\n"
                        + "You'll need warm clothing in the mountains. I recommend taking\n"
                        + "at least 2 sets of clothes per person. Each set is $10.00.\n"
                        + "***** How many sets would you like to buy? *****");
                try {
                    number = this.getInputs();
                    inputs2 = number[0];
                    item = Integer.parseInt(inputs2);

                    //continue on trail
                    item = Integer.parseInt(inputs2);
                } catch (NumberFormatException ex) {
                    Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                }
                 {
                    try {
                        SupplyControl.addToSupplies("clothing", item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 {
                    try {
                        SupplyControl.removeFromSupplies("money", store1.getClothingCost() * item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 PurchaseItemsView.displayPurchaseItemsView();
                break;
            case "4":
                this.console.println("\n"
                        + "I sell ammunition in boxes of 20 bullets. Each box costs $2.00.\n"
                        + "***** How many boxes would you like to buy? *****");
                try {
                    number = this.getInputs();
                    inputs2 = number[0];
                    item = Integer.parseInt(inputs2);

                    //continue on trail
                    item = Integer.parseInt(inputs2);
                } catch (NumberFormatException ex) {
                    Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                }
                 {
                    try {
                        SupplyControl.addToSupplies("ammunition", item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 {
                    try {
                        SupplyControl.removeFromSupplies("money", store1.getAmmoCost() * item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 PurchaseItemsView.displayPurchaseItemsView();
                break;
            case "5":
                this.console.println("\n"
                        + "It's a good idea to have a few spare parts for your wagon.\n"
                        + "***** How many would you like to buy? *****");
                try {
                    number = this.getInputs();
                    inputs2 = number[0];
                    item = Integer.parseInt(inputs2);

                    //continue on trail
                    item = Integer.parseInt(inputs2);
                } catch (NumberFormatException ex) {
                    Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                }
                 {
                    try {
                        SupplyControl.addToSupplies("wagonWheel", item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 {
                    try {
                        SupplyControl.removeFromSupplies("money", store1.getWheelCost() * item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 PurchaseItemsView.displayPurchaseItemsView();
                break;
            case "6":
                this.console.println("\n"
                        + "It's a good idea to have a few spare parts for your wagon.\n"
                        + "***** How many would you like to buy? *****");
                try {
                    number = this.getInputs();
                    inputs2 = number[0];
                    item = Integer.parseInt(inputs2);

                    //continue on trail
                    item = Integer.parseInt(inputs2);
                } catch (NumberFormatException ex) {
                    Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                }
                 {
                    try {
                        SupplyControl.addToSupplies("wagonAxel", item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 {
                    try {
                        SupplyControl.removeFromSupplies("money", store1.getAxelCost() * item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 PurchaseItemsView.displayPurchaseItemsView();
                break;
            case "7":
                this.console.println("\n"
                        + "It's a good idea to have a few spare parts for your wagon.\n"
                        + "***** How many would you like to buy? *****");
                try {
                    number = this.getInputs();
                    inputs2 = number[0];
                    item = Integer.parseInt(inputs2);

                    //continue on trail
                    item = Integer.parseInt(inputs2);
                } catch (NumberFormatException ex) {
                    Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                }
                 {
                    try {
                        SupplyControl.addToSupplies("wagonTonuge", item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 {
                    try {
                        SupplyControl.removeFromSupplies("money", store1.getTongueCost() * item);
                    } catch (GameControlException ex) {
                        Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 PurchaseItemsView.displayPurchaseItemsView();
                break;
            case "8":
                store1.setSpent(0);
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            default:
                this.console.println("Enter a valid option");

        }
        return false;

    }

    

}
