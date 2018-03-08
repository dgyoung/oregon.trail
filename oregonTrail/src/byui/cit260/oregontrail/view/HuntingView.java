package byui.cit260.oregontrail.view;

import oregontrail.OregonTrail;

/**
 *
 * @author Alexandra
 */
public class HuntingView extends View {
    
    public HuntingView() {
        System.out.println("\n"
                + "\n****************************************"
                + "\n           Let's Go Hunting!              "
                + "\n");
        OregonTrail.pressAnyKeyToContinue();
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
