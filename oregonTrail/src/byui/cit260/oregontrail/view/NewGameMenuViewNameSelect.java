/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.Character;
import java.util.Scanner;

/**
 *
 * @author David
 */
class NewGameMenuViewNameSelect {

    void displayNewGameMenuViewNameSelect() {
        
        Character character1 = new Character();
        Character character2 = new Character();
        Character character3 = new Character();
        Character character4 = new Character();
        Character character5 = new Character();

        System.out.println("**** What are the names in the members of your "
                + "party ****\n\n"
        + "1.\\ " + character1.getName() + "\n"
        + "2.\\ " + character2.getName() + "\n"
        + "3.\\ " + character3.getName() + "\n"
        + "4.\\ " + character4.getName() + "\n"
        + "5.\\ " + character5.getName() + "\n");
        boolean endOfView = false;

        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q")) {
                return; //exits program
            }
            //ENDIF endOfView = doAction(inputs)
            endOfView = this.doAction(inputs, character1);
        } while (!endOfView); //WHILE endOfView != true ;
        System.out.println("**** Your wagon payty ****\n\n"
        + "1.\\ " + character1.getName() + "\n"
        + "2.\\ " + character2.getName() + "\n"
        + "3.\\ " + character3.getName() + "\n"
        + "4.\\ " + character4.getName() + "\n"
        + "5.\\ " + character5.getName() + "\n");
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q")) {
                return; //exits program
            }
            //ENDIF endOfView = doAction(inputs)
            endOfView = this.doAction(inputs, character2);
        } while (!endOfView); //WHILE endOfView != true ;
        System.out.println("**** Your wagon payty ****\n\n"
        + "1.\\ " + character1.getName() + "\n"
        + "2.\\ " + character2.getName() + "\n"
        + "3.\\ " + character3.getName() + "\n"
        + "4.\\ " + character4.getName() + "\n"
        + "5.\\ " + character5.getName() + "\n");
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q")) {
                return; //exits program
            }
            //ENDIF endOfView = doAction(inputs)
            endOfView = this.doAction(inputs, character3);
        } while (!endOfView); //WHILE endOfView != true ;
        System.out.println("**** Your wagon payty ****\n\n"
        + "1.\\ " + character1.getName() + "\n"
        + "2.\\ " + character2.getName() + "\n"
        + "3.\\ " + character3.getName() + "\n"
        + "4.\\ " + character4.getName() + "\n"
        + "5.\\ " + character5.getName() + "\n");
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q")) {
                return; //exits program
            }
            //ENDIF endOfView = doAction(inputs)
            endOfView = this.doAction(inputs, character4);
        } while (!endOfView); //WHILE endOfView != true ;
        System.out.println("**** Your wagon payty ****\n\n"
        + "1.\\ " + character1.getName() + "\n"
        + "2.\\ " + character2.getName() + "\n"
        + "3.\\ " + character3.getName() + "\n"
        + "4.\\ " + character4.getName() + "\n"
        + "5.\\ " + character5.getName() + "\n");
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q")) {
                return; //exits program
            }
            //ENDIF endOfView = doAction(inputs)
            endOfView = this.doAction(inputs, character5);
        } while (!endOfView); //WHILE endOfView != true ;
        System.out.println("**** Your wagon payty ****\n\n"
        + "1.\\ " + character1.getName() + "\n"
        + "2.\\ " + character2.getName() + "\n"
        + "3.\\ " + character3.getName() + "\n"
        + "4.\\ " + character4.getName() + "\n"
        + "5.\\ " + character5.getName() + "\n");
        NewGameMenuViewSelectOccupation newGameMenuViewSelectOccupation = new NewGameMenuViewSelectOccupation();
        newGameMenuViewSelectOccupation.displayNewGameMenuViewSelectOccupation();

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
    
    private boolean doAction(String[] inputs, Character character) {
        //playersName = get the first value in the inputs array
        character.setName(inputs[0]);
        //player = savePlayer(playersName)
        //IF player == null
        if (character.getName() == null) {
            System.out.println("Could not create the player." + "\n"
                    + "Enter a different name.");

            return false;
        } else {
            System.out.println(
                    "=================================================\n"
                    + "Welcome to the game " + character.getName()
                    + "\nWe hope you have a lot of fun!\n"
                    + "=================================================");
            return true;
        }

    }
    
}
