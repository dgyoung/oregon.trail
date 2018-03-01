/*
 * created by Brad R. Allen
 */
package view;

import java.util.Scanner;

/**
 *
 * @author bradrallen
 */
public class ChangeRationsHelpView {
  public void displayRationsHelpView(){
        boolean endOfView = false;
        
        do {
            String [] inputs = getInputs();
            if (inputs.length <1 || inputs[0].toUpperCase().equals("Q")){
              return;
            }
            endOfView = doAction(inputs);
        } while (endOfView == false);    }

    private String[] getInputs() {
     String [] inputs = new String[1];
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("================================================= ");
        System.out.println("RATIONS HELP MENU");
        System.out.println("Filling - meals are large and generous.");
        System.out.println("Meager - meals are small, but adequate.");
        System.out.println("Bare Bones - meals are very small; everyone stays hungry.");
        System.out.println("C - Continue");
        System.out.println("================================================= ");
        
        while (valid == false) {
            String input = keyboard.nextLine().trim();
            if (input.length()<1){
                System.out.print("You must enter a value.\n");
            }else{
                inputs[0] = input;
                valid = true;
            }
        }
        return inputs;
    }
  private boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "C":
                return true;
            default:
                System.out.println("Invalid menu item. Please try again:\n");
                break;
        }
        return false;
    }    
}
