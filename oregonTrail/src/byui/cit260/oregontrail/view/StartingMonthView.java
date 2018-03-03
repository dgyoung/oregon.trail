package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Alexandra
 */
class StartingMonthView{
    
    void displayStartingMonthView(){
        
        System.out.println("********** The Oregon Trail **********\n"
            + "\n"
            + "  It is 1848. Your jumping off place\n" 
            + " for Oregon is Independence, Missouri. \n"
            + "\n"
            + "* Choose a month to begin journey: *\n"
            + "* 1.   March *\n"
            + "* 2.   April *\n"
            + "* 3.   May *\n"
            + "* 4.   June *\n"
            + "* 5.   July *\n"
            + "* 6.   When should I leave? *\n");
        boolean endOfView = false;
 
        do {
            String[] inputs = this.getInputs();
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

            System.out.println("\n***** Which month do you choose? *****\n ");

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
            SimpleDateFormat sdf = new SimpleDateFormat("MMMMM dd yyyy");        
            String month;
            month = inputs[0];

            Calendar calendar = GameControl.setCalendar();

            if (month == null) {
                System.out.println("Please enter a correct input");

                return false;
            }
            SelectOccupationView SelectOccupationView
                    = new SelectOccupationView();
            switch (month) {
                case "1":
                    //update a date
                    calendar.set(Calendar.YEAR, 1848);
                    calendar.set(Calendar.MONTH, 02);
                    calendar.set(Calendar.DATE, 01);
                    System.out.println("\nYou'll begin your journey on " + sdf.format(calendar.getTime())+ "\n");
                    SelectOccupationView.displaySelectOccupationView();
                case "2":
                    calendar.set(Calendar.YEAR, 1848);
                    calendar.set(Calendar.MONTH, 03);
                    calendar.set(Calendar.DATE, 01);
                    System.out.println("\nYou'll begin your journey on " + sdf.format(calendar.getTime())+ "\n");
                    SelectOccupationView.displaySelectOccupationView();
                case "3":
                    calendar.set(Calendar.YEAR, 1848);
                    calendar.set(Calendar.MONTH, 04);
                    calendar.set(Calendar.DATE, 01);                    
                    System.out.println("\nYou'll begin your journey on " + sdf.format(calendar.getTime())+ "\n");
                    SelectOccupationView.displaySelectOccupationView();
                case "4":
                    calendar.set(Calendar.YEAR, 1848);
                    calendar.set(Calendar.MONTH, 05);
                    calendar.set(Calendar.DATE, 01);
                    System.out.println("\nYou'll begin your journey on " + sdf.format(calendar.getTime())+ "\n");
                    SelectOccupationView.displaySelectOccupationView();
                case "5":
                    calendar.set(Calendar.YEAR, 1848);
                    calendar.set(Calendar.MONTH, 06);
                    calendar.set(Calendar.DATE, 01);
                    System.out.println("\nYou'll begin your journey on " + sdf.format(calendar.getTime())+ "\n");
                    SelectOccupationView.displaySelectOccupationView();
                case "6":
                    System.out.println("\n"
                            + "You attend a public meeting held for \n" 
                            + "\"folks with the California - Oregon fever. \n" 
                            + "\n" 
                            + "You're told: If you leave too early, \n" 
                            + "there won't be any grass for your oxen to eat. \n" 
                            + "If you leave too late, you may not get to Oregon \n" 
                            + "before winder comes. If you leave at just \n" 
                            + "the right time, there will be green grass \n" 
                            + "and the weather will still be cool.\n" 
                            + "\n"
                            + "* Choose a month to begin journey: *\n"
                            + "* 1.   March *\n"
                            + "* 2.   April *\n"
                            + "* 3.   May *\n"
                            + "* 4.   June *\n"
                            + "* 5.   July *\n"
                            + "* 6.   When should I leave? *\n");
                                    break;
                default:
                    System.out.println("Enter a valid option");

            }
            return false;
    }

}
