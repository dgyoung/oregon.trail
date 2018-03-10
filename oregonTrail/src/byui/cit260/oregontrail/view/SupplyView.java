package byui.cit260.oregontrail.view;
import oregontrail.OregonTrail;

/**
 *
 * @author Alexandra
 */
public class SupplyView extends View{

    public SupplyView() {
        System.out.println("\n"
                + "\n****************************************"
                + "\n                 Inventory              "
                + "\n  Name and Cost                         ");
        OregonTrail.pressAnyKeyToContinue();
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}