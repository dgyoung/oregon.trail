
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;

/*\
 * @author David
 */
public class HelpMenuView extends View{

    public HelpMenuView() {

        super("Try taking a journey by\n"
                + "covered wagon across 2000\n"
                + "miles of plains, rivers, and\n"
                + "mountains. Try! On the plains,\n"
                + "will you slosh your oxen through\n"
                + "mud and water-filled ruts or will\n"
                + "you plod through dust six inches deep?\n"
                + "Press C to continue");
        }

    @Override
    public boolean doAction(String inputs) {
        String[] help = new String[3];
        help[0] = "How will you cross the rivers?\n"
                + "If you have money, you might\n"
                + "take a ferry (if there is a \n"
                + "ferry). Or, you can ford the \n"
                + "river and hope you and your wagon\n"
                + "aren't swallowed alive!\n"
                + "Press C to continue";
        help[1] = "What about supplies? Well, if you're\n"
                + "low on food you can hunt. You might get\n"
                + "a buffalo...you might. And there are \n"
                + "bear in the mountains.\n"
                + "Press C to continue";
        help[2] = "At the Dalles, you can try navigating \n"
                + "the Columbia River, but if running the\n"
                + "rapids with a makeshift raft makes you\n"
                + "queasy, better take the Barlow Road.\n"
                + "Press C to continue";
        String choice;
        choice = inputs;
        Player player = GameControl.saveGame(choice);
        int increment = 0;
        if (choice == null) {
            this.console.println("Press C to continue");
            return false;
        }
        if (increment == 3) {
            return true;
        }
        switch (choice) {
            case "C":
                this.console.println(help[increment]);
                break;
            default:
                this.console.println("Enter a valid option");

        }

        return false;
    }
}
