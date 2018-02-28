/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.control.SupplyControl;
import byui.cit260.oregontrail.model.Order;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.StoreScene;
import byui.cit260.oregontrail.model.Supplies;
import java.util.Scanner;

/**
 *
 * @author David
 */
class NewGameMenuViewPurchaseItems {

    void displayNewGameMenuViewPurchaseItems() {
        StoreScene storeScene = null;
        SupplyControl.initilizeSupplies();
        Supplies supplies = new Supplies();
        System.out.println(
                "***** The Oregon Trail – " + storeScene.store1.getStoreName() + " *****\n"
                + "\n"
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
                + "* If you are finished hit \"8\"\n"
                + "********************************************");

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

    private String[] getInputs() {

        String[] inputs = new String[1];

        Scanner scanner = new Scanner(System.in);
        String userInput = null;
        String trimmedUserInput = null;
        boolean valid = false;
        while (!valid) {

            System.out.println("\nChoose an item to add to your order:\\n\"");

            userInput = scanner.nextLine();
            trimmedUserInput = userInput.trim();

            if (trimmedUserInput.length() < 1) {
                System.out.println("You must enter a non-blank value");
            } else {
                valid = true;
            }
        }
        inputs[0] = trimmedUserInput;
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
        switch (choice) {
            case "1":
                System.out.println("How much would you like to buy?");
                number = this.getInputs();
                inputs2 = number[0];
                SupplyControl.addToSupplies("oxen", Integer.parseInt(inputs2));
                SupplyControl.removeFromSupplies("money", storeScene.store1.getOxenCost());
                break;
            case "2":
                System.out.println("How much would you like to buy?");
                number = this.getInputs();
                inputs2 = number[0];
                SupplyControl.addToSupplies("food", Integer.parseInt(inputs2));
                SupplyControl.removeFromSupplies("money", storeScene.store1.getFoodCost());
                break;
            case "3":
                System.out.println("How much would you like to buy?");
                number = this.getInputs();
                inputs2 = number[0];
                SupplyControl.addToSupplies("clothing", Integer.parseInt(inputs2));
                SupplyControl.removeFromSupplies("money", storeScene.store1.getClothingCost());
                break;
            case "4":
                System.out.println("How much would you like to buy?");
                number = this.getInputs();
                inputs2 = number[0];
                SupplyControl.addToSupplies("ammunition", Integer.parseInt(inputs2));
                SupplyControl.removeFromSupplies("money", storeScene.store1.getAmmoCost());
                break;
            case "5":
                System.out.println("How much would you like to buy?");
                number = this.getInputs();
                inputs2 = number[0];
                SupplyControl.addToSupplies("wagonWheel", Integer.parseInt(inputs2));
                SupplyControl.removeFromSupplies("money", storeScene.store1.getWheelCost());
                break;
            case "6":
                System.out.println("How much would you like to buy?");
                number = this.getInputs();
                inputs2 = number[0];
                SupplyControl.addToSupplies("wagonAxel", Integer.parseInt(inputs2));
                SupplyControl.removeFromSupplies("money", storeScene.store1.getAxelCost());
                break;
            case "7":
                System.out.println("How much would you like to buy?");
                number = this.getInputs();
                inputs2 = number[0];
                SupplyControl.addToSupplies("wagonTonuge", Integer.parseInt(inputs2));
                SupplyControl.removeFromSupplies("money", storeScene.store1.getTongueCost());
                break;
            default:
                System.out.println("Enter a valid option");

        }
        return false;

    }

}
