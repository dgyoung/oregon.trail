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
