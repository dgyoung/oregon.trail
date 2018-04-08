package byui.cit260.oregontrail.view;

import byui.cit260.orgontrail.exceptions.ReportControlException;

public class ReportView extends View {
  
  public ReportView() {
        super("**** The Oregon Trail – REPORT MENU *****\n"
                + "\nSelect a report :\n"
                + "C) Character Report \n"
                + "G) Exit to Game Menu \n"
                + "\n***** What is your choice? *****");
    }

  @Override
    public boolean doAction(String inputs) {
        String choice;
        choice = inputs;
        if (choice == null) {
            ErrorView.display(this.getClass().getName(), "Plese enter a valid option");
            return false;
        }
        switch (choice.toUpperCase()) {
            case "C":
                {
                  try {
                    this.printReport("character");
                  } catch (ReportControlException ex) {
                  ErrorView.display(this.getClass().getName(), ex.getMessage());
                  }
                }
                break;
            case "G":
              GameMenuView gameMenuView = new GameMenuView();
              gameMenuView.display();
            default:
                ErrorView.display(this.getClass().getName(),
                                  "Enter a valid option");
        }
        return false;
    }

  private void printReport(String report) throws ReportControlException {
        ReportPrintView reportPrintView = new ReportPrintView();
        reportPrintView.setReport(report);
        reportPrintView.display();  }
   
}

//this was the report view Allie made and committed that isn't available in GitHub now
/*package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import java.io.IOException;


public class ReportView extends View {
    
    public ReportView() {
        super("**** REPORT MENU *****\n"
                + "\n"
                + " 1)   Print Locations in Game \n"
                + "\n***** What is your choice? *****\n");
    }

    @Override
    public boolean doAction(String inputs) {
        String choice;
        choice = inputs;
        Player player = GameControl.createPlayer(choice);
        if (choice == null) {
            ErrorView.display(this.getClass().getName(),
                              "Plese enter a character");
            return false;
        }
        switch (choice) {
            
            case "1":
                this.console.println("\n Enter a filepath where the report will output: \n");
                try {
                    String path = null;
                    path = this.keyboard.readLine();
                    this.console.println("Report successfully saved to " + path );
                } catch (IOException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
                    this.console.println("\n" + this.displayMessage + "\n");
                }
            default:
                ErrorView.display(this.getClass().getName(),
                                  "Enter a valid option");

        }
        return false;
    }

private void printLocationsToDisk() {
  
    Location[][] locations = OregonTrail.getCurrentGame().getMap().getLocations();
        int rows = locations[0].length;
        int columns = locations[1].length;
        String path = null;
        this.console.println("\n Enter a filepath where the report will output: \n");

        try {

            path = this.keyboard.readLine();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
            this.console.println("\n" + this.displayMessage + "\n");
        }

        try (PrintWriter out = new PrintWriter(path)) {
            out.println("\n\n     Location Report");
            out.printf("%n%-40s", "Location Name");
            out.printf("%n%-40s", "--------------------");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    places = locations[i][j];
                    if (!places.isEmpty()) {
                        out.printf("The map is blank", 0);
                    }
                }
            }
            this.console.println("Report successfully saved to " + path);
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

    }

}*/