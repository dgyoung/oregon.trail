package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.WagonControl;

/**
 *
 * @author Alexandra
 * updated by brad
 */
public class SetPaceView extends View{
    
    public SetPaceView() {
        super("\n"
                + "\n***** Change Pace *****"
                + "\nCURRENTLY: '" + WagonControl.getWagonPace() + "'"
                + "\n"
                + "\n The pave at which you travel can change"
                + "\nYour choices are:"
                + "\n"
                + "\n 1. Steady"
                + "\n 2. Strenuous"
                + "\n 3. Greuling"
                + "\n 4. Find out what these different paces mean"
                + "\n"
                + "\n What is your choice?");
    }

    @Override
    public boolean doAction(String inputs) {
      String choice;
      choice = inputs;
      
      if (choice == null) {
          ErrorView.display(this.getClass().getName(),
                            "Please enter a correct input");
          return false;
      }
      
      switch (choice) {
            case "1":
                WagonControl.changePace("Steady");
                return true;
            case "2":
                WagonControl.changePace("Strenuous");
                return true;
            case "3":
                WagonControl.changePace("Greuling");
                return true;
            case "4":
                this.console.println("\nSET PACE HELP MENU\n"
                        + "Steady - You travel about 8 hours a day, taking\n"
                        + "frequent rests. You take care not to get too tired.\n"
                        + "\n"
                        + "Strenuous - You travel about 12 hour a day, starting\n"
                        + "just after sunrise and stopping shortly before sunset.\n"
                        + "You stop to rest only when necessary. You finish each day feeling very tired.\n"
                        + "\n"
                        + "Grueling - You travel about 16 hours a day, starting before\n"
                        + "sunrise and continuing until dark. You almost never stop to rest.\n"
                        + "You do not get enough sleep at night. You finish each day\n"
                        + "feeling absolutely exhausted, and your health suffers.\n"
                );
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                                  "Enter a valid option");
      }
        return false;
    }
}