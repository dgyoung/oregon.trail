package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.control.HuntControl;
import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;
import oregontrail.OregonTrail;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexandra
 */
public class HuntingView extends View {

       public HuntingView() {
        super("\n***** Out Hunting *****\n"
                + "After POW, BANG or FIRE show on the seceen, type the \n"
                + "word as fast as you can or your prey may get away.\n"
                + "To start press \"R\" for Ready or \n \"Q\" to Quit. \n");
    }

    @Override
    public boolean doAction(String inputs) {
        String choice;
        choice = inputs.toUpperCase();
        //player = savePlayer(playersName)
        Player player = GameControl.saveGame(choice);
        //IF player == null
        if (choice == null) {
            System.out.println("Plese enter a character");

            return false;
        }
        switch (choice) {
            case "R": {
                try {
                    HuntControl.hunt();
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
            default:
                System.out.println("Enter a valid option");

        }
        return false;
    }

    

    
    
}
