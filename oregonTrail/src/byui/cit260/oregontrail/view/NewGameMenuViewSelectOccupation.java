/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.control.SupplyControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.Supplies;
import java.util.Scanner;

/**
 *
 * @author David
 */
class NewGameMenuViewSelectOccupation {

    void displayNewGameMenuViewSelectOccupation() {

        System.out.println("********** The Oregon Trail **********\n"
                + "\n"
                + "     Many kinds of people made \n"
                + "         the trip to Oregon. \n"
                + "\n"
                + "* Choose your occupation: *\n"
                + "* 1. Banker from Boston *\n"
                + "* 2. Carpenter from Ohio *\n"
                + "* 3. Farmer from Illinois *\n"
                + "* 4. Which one should I choose? *\n");
        boolean endOfView = false;

        do {

            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("5")) {
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

            System.out.println("\n***** What is your choice? *****\n ");

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
//playersName = get the first value in the inputs array
        String choice;
        choice = inputs[0];
        //player = savePlayer(playersName)
        Player player = GameControl.saveGame(choice);
        //IF player == null
        if (choice == null) {
            System.out.println("Please enter a correct input");

            return false;
        }
        NewGameMenuViewPurchaseItems newGameMenuViewPurchaseItems
                = new NewGameMenuViewPurchaseItems();
        switch (choice) {
            case "1":
                GameControl.setCharacterChoice("Banker");
                SupplyControl.addToSupplies("money", 1600);
                newGameMenuViewPurchaseItems.displayNewGameMenuViewPurchaseItems();

                return true;
            case "2":
                GameControl.setCharacterChoice("Carpenter");
                SupplyControl.addToSupplies("money", 800);
                newGameMenuViewPurchaseItems.displayNewGameMenuViewPurchaseItems();
                return true;
            case "3":
                GameControl.setCharacterChoice("farmer");
                SupplyControl.addToSupplies("money", 400);
                newGameMenuViewPurchaseItems.displayNewGameMenuViewPurchaseItems();
                return true;
            case "4":
                System.out.println("\nTraveling to Oregon isnt' easy!\n"
                        + "But if you're a banker, you'll have more money for\n"
                        + "supplies and services than a carpenter or a farmer.\n"
                        + "\n"
                        + "However, the harder you have to try the more point you have to deserve! \n"
                        + "Therefore, the farmer earns the greatest number of poinst and the banker earns the least.");
                break;
            default:
                System.out.println("Enter a valid option");

        }
        return false;
    }

}
