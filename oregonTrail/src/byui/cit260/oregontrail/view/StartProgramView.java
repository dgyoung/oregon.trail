package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import static byui.cit260.oregontrail.control.GameControl.saveGame;
import static byui.cit260.oregontrail.control.GameControl.setCharactersNames;
import byui.cit260.oregontrail.model.Player;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author Alexandra
 */
public class StartProgramView {

    public StartProgramView() {
        System.out.println(
                "\n*****************************************************************"
                + "\n"
                + "\n The Oregon Trail game is a text based role playing game."
                + "\n You'll take on the role of leader of a wagon party and"
                + "\n everyone in your wagon is counting on you to keep them alive."
                + "\n"
                + "\n You will need to prepare to travel through plains, rivers,"
                + "\n and mountains as you make your way to Oregon."
                + "\n Resources will be scarce, and you will encounter challenges,"
                + "\n including disease, river crossings, thieves, and limited food."
                + "\n "
                + "\n But don’t be too intimidated, the scenery is wonderful and"
                + "\n the challenge is possible – as long as you make it through"
                + "\n the game with one wagon member alive, you win!"
                + "\n"
                + "\n*****************************************************************");

    }

    public void displayStartProgramView() {
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

            System.out.println("\n" + "Please enter your name: ");

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
        String playersName;
        playersName = inputs[0];
        //player = savePlayer(playersName)
        Player player = GameControl.saveGame(playersName);
        //IF player == null
        if (playersName == null) {
            System.out.println("Could not create the player." + "\n"
                    + "Enter a different name.");

            return false;
        } else {          
            System.out.println("\n"
                    + "=================================================\n"
                    + "      Welcome to the game " + playersName
                    + "\n      We hope you have a lot of fun!\n"
                    + "================================================="
                    + "\n");

            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.displayMainMenuView();
            return true;
        }

    }

}
