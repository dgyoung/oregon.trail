package byui.cit260.oregontrail.view;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Alexandra
 */
class NewGameMenuViewStartingMonth {
    
    void displayNewGameMenuViewStartingMonth(){
       
        System.out.println("********** The Oregon Trail **********\n"
                + "\n"
                + "  It is 1848. Your jumping off place for\n" 
                +"    Oregon is Independence, Missouri. \n"
                + "\n"
                + "* Choose a moth to begin journey: *\n"
                + "* 1.   March *\n"
                + "* 2.   April *\n"
                + "* 3.   May *\n"
                + "* 4.   June *\n"
                + "* 5.   July *\n"
                + "* 6.   When should I leave? *\n");
        boolean endOfView = false;
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
        String month;
        month = inputs[0];
        Player player = GameControl.saveGame(month);
        if (month == null) {
            System.out.println("Please enter a correct input");
            return false;
        }
        NewGameMenuViewSelectOccupation newGameMenuViewSelectOccupation
                = new NewGameMenuViewSelectOccupation();
        switch (month) {
            case "1":
                GameControl.cal.set(1848,Calendar.MARCH,1);
                newGameMenuViewSelectOccupation.displayNewGameMenuViewSelectOccupation();
            case "2":
                GameControl.cal.set(1848,Calendar.APRIL,1);
                newGameMenuViewSelectOccupation.displayNewGameMenuViewSelectOccupation();
                return true;
            case "3":
                GameControl.cal.set(1848,Calendar.MAY,1);
                newGameMenuViewSelectOccupation.displayNewGameMenuViewSelectOccupation();
                return true;
            case "4":
                GameControl.cal.set(1848,Calendar.JUNE,1);
                newGameMenuViewSelectOccupation.displayNewGameMenuViewSelectOccupation();
                return true;
            case "5":
                GameControl.cal.set(1848,Calendar.JULY,1);
                newGameMenuViewSelectOccupation.displayNewGameMenuViewSelectOccupation();
                return true;
            case "6":
                System.out.println("\n"
                        + "You attend a public meeting held for \n" 
                        + "\"folks with the California - Oregon fever.\" \n" 
                        + "\n" 
                        + "You're told: If you leave too early, \n" 
                        + "there won't be any grass for your oxen to eat. \n" 
                        + "If you leave too late, you may not get to Oregon \n" 
                        + "before winder comes. If you leave at just \n" 
                        + "the right time, there will be green grass \n" 
                        + "and the weather will still be cool.\n" 
                        + "\n" 
                        + "(Enter \"C\" to Continue)");
                break;
            default:
                System.out.println("Enter a valid option");

        }
        return false;
    }

}
