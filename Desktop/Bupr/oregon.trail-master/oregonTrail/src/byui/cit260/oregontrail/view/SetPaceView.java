package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.WagonControl;

/**
 *
 * @author Alexandra
 */
public class SetPaceView {
    
    void display() {
        System.out.println("\n"
                + "\n***** Change Pace *****"
                + "\nCURRENTLY: '" + WagonControl.getWagonPace() + "'"
                + "\n"
                + "\n The pave at which you travel can change"
                + "\nYour choice are:"
                + "\n"
                + "\n 1. Steady"
                + "\n 2. Strenuous"
                + "\n 3. Greuling"
                + "\n 4. Find out what these different paces mean"
                + "\n"
                + "\n What is your choice?");
    }
}