package byui.cit260.oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author Alexandra
 */
public class StartProgramView {

    public StartProgramView() {

    }

    public void displayStartProgramView() {
        boolean endOfView = false;
        String[] inputs = this.getInputs();
        do {
            if (inputs[0] == null || inputs[0].equals('6')) {//IF no inputs were entered OR the first input is Q
                return;
            }
            if (endOfView = doAction(inputs)) {
                endOfView = true;
            }
            //ENDIF endOfView = doAction(inputs)
        } while (endOfView == false); //WHILE endOfView   != true ;

    }

    private String[] getInputs() {
        String[] inputs = new String[1];

        System.out.println("this is a description of the view");
        
        Scanner scanner = new Scanner(System.in);
        String userInput;
        String trimmedUserInput = null;
        boolean valid = false;
        while (valid == false) {
            System.out.println("enter in a character: ");
            userInput = scanner.nextLine();
            trimmedUserInput = userInput.trim();
            if (trimmedUserInput.length() < 1) {
                System.out.println("You must enter a non-blank value");
            }
            else {
                valid = true;
            }
        }
        inputs[0] = trimmedUserInput;
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("**** doAction() called ****");
        System.out.println("\tinputs = " + inputs[0]);

        return true;
    }

}
