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
import byui.cit260.oregontrail.model.Supplies;
import byui.cit260.orgontrail.exceptions.GameControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
class StoreView {

    void displayPurchaseItemsView() {
        StoreScene storeScene = null;
        SupplyControl.initilizeSupplies();
        Supplies supplies = new Supplies();
        System.out.println("\n"
                + "***** The Oregon Trail – " + storeScene.store1.getStoreName() + " *****\n" //There is only one store in the game. ***** The Oregon Trail – Matt’s General Store *****
                + "\n" //There are trading posts/opportunities along the trail, but they don't work like this scene.
                + "* Item Name Price *\n"
                + "* 1. Oxen $" + storeScene.store1.getOxenCost() + "\n"
                + "* 2. Food $" + storeScene.store1.getFoodCost() + "\n"
                + "* 3. Clothing $" + storeScene.store1.getClothingCost() + "\n"
                + "* 4. Ammunition $" + storeScene.store1.getAmmoCost() + "\n"
                + "* 5. Wagon Wheel $" + storeScene.store1.getWheelCost() + "\n"
                + "* 6. Wagon Axel $" + storeScene.store1.getAxelCost() + "\n"
                + "* 7. Wagon Tonuge $" + storeScene.store1.getTongueCost() + "\n"
                + "* Total Bill $0 *\n"
                + "* Total Funds $" + supplies.getMoney() + "\n"
                + "* Funds Remaining $800 *\n"
                + "********************************************\n"
                + "***** If you are finished enter \"8\" *****\n");

        boolean endOfView = false;
        String[] inputs = this.getInputs();

        do {
            if (inputs[0].toUpperCase().equals("Q")) {
                return; //exits program
            }
            //ENDIF endOfView = doAction(inputs)
            endOfView = this.doAction(inputs);

        } while (!endOfView); //WHILE endOfView != true ;

    }

    //@Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        String userInput = null;
        String trimmedUserInput = null;
        boolean valid = false;
        try{
            while (!valid) {

              //userInput = this.keyboard.readLine();
              trimmedUserInput = userInput.trim();

              if (trimmedUserInput.length() < 1) {
                System.out.println("You must enter a non-blank value");
              } else {
                inputs[0] = trimmedUserInput;
                valid = true;
              }
            }
        } catch (Exception ex) {
            System.out.println("Error reading input: " + ex.getMessage());      }
        System.out.println("***** Choose an item to add to your order: *****");

        return inputs;
    }

    private boolean doAction(String[] inputs) {
        Order order = new Order();
        String choice;
        choice = inputs[0];
        //player = savePlayer(playersName)
        Player player = GameControl.saveGame(choice);
        //IF player == null
        if (choice == null) {
            System.out.println("Plese enter a character");

            return false;
        }
        String inputs2;
        String[] number;
        StoreScene storeScene = null;
        int item = 0;
        switch (choice) {
            case "1":
                System.out.println("There are 2 oxen in a yoke; I recommend at least 3 yoke. I charge $40 a yoke.\n"
                        + "***** How many yoke would you like to buy? *****");
                try {
                    number = this.getInputs();
                    inputs2 = number[0];
                    item = Integer.parseInt(inputs2);

                    //continue on trail
                    item = Integer.parseInt(inputs2);
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                    System.out.println("Please enter a number");
                }
                SupplyControl.addToSupplies("oxen", item);
                SupplyControl.removeFromSupplies("money", storeScene.store1.getOxenCost());
                break;
            case "2":
                System.out.println("\n"
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
                SupplyControl.addToSupplies("food", item);
                SupplyControl.removeFromSupplies("money", storeScene.store1.getFoodCost());
                break;
            case "3":
                System.out.println("\n"
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
                SupplyControl.addToSupplies("clothing", item);
                SupplyControl.removeFromSupplies("money", storeScene.store1.getClothingCost());
                break;
            case "4":
                System.out.println("\n"
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
                SupplyControl.addToSupplies("ammunition", item);
                SupplyControl.removeFromSupplies("money", storeScene.store1.getAmmoCost());
                break;
            case "5":
                System.out.println("\n"
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
                SupplyControl.addToSupplies("wagonWheel", item);
                SupplyControl.removeFromSupplies("money", storeScene.store1.getWheelCost());
                break;
            case "6":
                System.out.println("\n"
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
                SupplyControl.addToSupplies("wagonAxel", item);
                SupplyControl.removeFromSupplies("money", storeScene.store1.getAxelCost());
                break;
            case "7":
                System.out.println("\n"
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
                SupplyControl.addToSupplies("wagonTonuge", item);
                SupplyControl.removeFromSupplies("money", storeScene.store1.getTongueCost());
                break;
            case "8":
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            default:
                System.out.println("Enter a valid option");

        }
        return false;

    }

}
