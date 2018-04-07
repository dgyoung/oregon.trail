/*
 * created by Brad R. Allen
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.control.ReportControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.orgontrail.exceptions.GameControlException;
import byui.cit260.orgontrail.exceptions.ReportControlException;
import java.io.IOException;
import oregontrail.OregonTrail;

/**
 *
 * @author bradrallen
 */
public class ReportPrintView extends View {
  public String report;
  
  public ReportPrintView() {
    super("**** The Oregon Trail – PRINT REPORT MENU *****\n"
          + "\nEnter a path for your game file:\n"
        );
  }

  @Override
  public boolean doAction(String inputs) {
        String filePath;
        filePath = inputs;
        try{
          ReportControl.saveReportFile(this.report,filePath);
        }catch (ReportControlException | IOException ex) {
          this.console.println("Error Saving File:" + ex.getMessage());
          return false;
        }
        this.console.println("File " + filePath + " was saved sucessfully");
          return true;
  }
  
  public String getReport() {
    return report;
  }

  public void setReport(String report) {
    this.report = report;
  }
  public static void printSpecificReport (String report){
    
  }
}
