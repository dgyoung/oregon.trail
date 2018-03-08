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
class MainMenuView {

    void displayMainMenuView() {

        System.out.println("**** The Oregon Trail – MAIN MENU *****\n"
                + "\n"
                + "* 1. Start New Game *\n"
                + "* 2. Resume Saved Game *\n"
                + "* 3. Help *\n"
                + "* 4. Exit *\n");
        boolean endOfView = false;

        do {

            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("4")) {
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

            System.out.println("***** What is your choice? *****");

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
            System.out.println("Plese enter a character");

            return false;
        }
        switch (choice) {
            case "1":
                NameSelectView newgameMenuView = new NameSelectView();
                newgameMenuView.displayNameSelectView();
                break;
            case "2":
                StartExistingGameView startExistingGameView = new StartExistingGameView();
                startExistingGameView.displayStartExistingGameView();
                break;
            case "3":
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.displayHelpMenuView();
                break;
            default:
                System.out.println("Enter a valid option");

        }
        return false;
    }

}
