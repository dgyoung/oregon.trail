package byui.cit260.oregontrail.view;
import oregontrail.OregonTrail;

/**
 *
 * @author Alexandra
 */
public class SupplyView {

    void display() {
        System.out.println("\n"
                + "\n****************************************"
                + "\n                 Inventory              "
                + "\n  Name and Cost                         ");
        OregonTrail.pressAnyKeyToContinue();
    }
}