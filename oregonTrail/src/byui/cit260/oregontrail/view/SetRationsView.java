package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.WagonControl;

/**
 *
 * @author Alexandra
 */
public class SetRationsView extends View{
    
    public SetRationsView() {
        super("\n"
                + "\n***** Change Food Rations *****"
                + "\nCURRENTLY: '" + WagonControl.getWagonRations() + "'"
                + "\n"
                + "\n The amount of food the peole in your party eat each"
                + "\n day can change. These amounts are:"
                + "\n"
                + "\n 1. Filling - meals are large and generous"
                + "\n 2. Meager - meals are small, but adequate."
                + "\n 3. Bare Bones - meals are very small; everyone stays hungry"
                + "\n 4. Find out what these different paces mean"
                + "\n"
                + "\n What is your choice?");
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
