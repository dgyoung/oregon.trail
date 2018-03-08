package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.WagonControl;

/**
 *
 * @author Alexandra
 */
public class SetPaceView extends View{
    
    public SetPaceView() {
        super("\n"
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

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}