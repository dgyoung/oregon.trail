/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author David
 */
class HelpMenuView {

    void displayHelpMenuView() {

        System.out.println("Try taking a journey by\n" +
"covered wagon across 2000\n" +
"miles of plains, rivers, and\n" +
"mountains. Try! On the plains,\n" +
"will you slosh your oxen through\n" +
"mud and water-filled ruts or will\n" +
"you plod through dust six inches deep?\n" +
                "Press C to continue");
        boolean endOfView = false;
        
        String[] help = new String[3];
        help[0] = "How will you cross the rivers?\n" +
"If you have money, you might\n" +
"take a ferry (if there is a \n" +
"ferry). Or, you can ford the \n" +
"river and hope you and your wagon\n" +
"aren't swallowed alive!\n" +
                "Press C to continue";
        help[1] = "What about supplies? Well, if you're\n" +
"low on food you can hunt. You might get\n" +
"a buffalo...you might. And there are \n" +
"bear in the mountains.\n" +
                "Press C to continue";
        help[2] = "At the Dalles, you can try navigating \n" +
"the Columbia River, but if running the\n" +
"rapids with a makeshift raft makes you\n" +
"queasy, better take the Barlow Road.\n" +
                "Press C to continue";

            int increment = 0;
        do {

            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q")) {
                return; //exits program
            }
            //ENDIF endOfView = doAction(inputs)
            endOfView = this.doAction(inputs, increment, help);
            increment++;
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
            trimmedUserInput = userInput.trim().toUpperCase();

            if (trimmedUserInput.length() < 1) {
                System.out.println("You must enter a non-blank value");
            } else {
                valid = true;
            }
        }
        inputs[0] = trimmedUserInput;
        return inputs;
    }

    private boolean doAction(String[] inputs, int increment, String[] help) {
//playersName = get the first value in the inputs array
        String choice;
        choice = inputs[0];
        //player = savePlayer(playersName)
        Player player = GameControl.saveGame(choice);
        //IF player == null
        if (choice == null) {
            System.out.println("Press C to continue");

            return false;
        }
        if (increment == 3){
            return true;
        }
        switch (choice) {
            case "C":
                System.out.println(help[increment]);
                return false;
            default:
                System.out.println("Enter a valid option");
                return false;

        }
    }
}
