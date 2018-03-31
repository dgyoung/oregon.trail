package byui.cit260.oregontrail.view;

import java.io.PrintWriter;
import oregontrail.OregonTrail;

public class ErrorView {
  private static PrintWriter console = OregonTrail.getOutFile();
  private static PrintWriter log = OregonTrail.getLogFile();

    private static final PrintWriter errorFile = OregonTrail.getOutFile();
    private static final PrintWriter logFile = OregonTrail.getLogFile();

    public static void display(String className, String errorMessage) {

        console.println(
              "\n--- ERROR  --------------------"
             +"\n" + errorMessage
             +"\n------------------------------");
        
        log.printf("%n%n%s", className + " - " + errorMessage);
        OregonTrail.pressAnyKeyToContinue();
    }
}