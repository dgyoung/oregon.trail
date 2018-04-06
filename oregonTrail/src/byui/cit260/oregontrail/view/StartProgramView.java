package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import java.io.PrintWriter;
import oregontrail.OregonTrail;

/**
 *
 * @author Alexandra
 */
public class StartProgramView extends View {
    
    protected final PrintWriter console = OregonTrail.getOutFile();

    public StartProgramView() {
        super(
                "\n*****************************************************************"
                + "\n"
                + "\n The Oregon Trail game is a text based role playing game."
                + "\n You'll take on the role of leader of a wagon party and"
                + "\n everyone in your wagon is counting on you to keep them alive."
                + "\n"
                + "\n You will need to prepare to travel through plains, rivers,"
                + "\n and mountains as you make your way to Oregon."
                + "\n Resources will be scarce, and you will encounter challenges,"
                + "\n including disease, river crossings, thieves, and limited food."
                + "\n "
                + "\n But don’t be too intimidated, the scenery is wonderful and"
                + "\n the challenge is possible – as long as you make it through"
                + "\n the game with one wagon member alive, you win!"
                + "\n"
                + "\n*****************************************************************\n"
                + "Please enter your name: ");
    }

    @Override
    public boolean doAction(String inputs) {
        //playersName = get the first value in the inputs array
        String playersName;
        playersName = inputs;
        //player = savePlayer(playersName)
        Player player = GameControl.saveGame(playersName);
        //IF player == null
        if (playersName == null) {
            this.console.println("Could not create the player." + "\n"
                    + "Enter a different name.");

            return false;
        } else {
            this.console.println("\n"
                    + "=================================================\n"
                    + "      Welcome to the game " + playersName
                    + "\n      We hope you have a lot of fun!\n"
                    + "================================================="
                    + "\n");

            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();
            return true;
        }

    }

}
