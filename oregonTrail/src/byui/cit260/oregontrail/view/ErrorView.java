package byui.cit260.oregontrail.view;

import java.io.PrintWriter;
import oregontrail.OregonTrail;

/**
 *
 * @author Alexandra
 */
public class ErrorView {

    private static final PrintWriter errorFile = OregonTrail.getOutFile();
    private static final PrintWriter logFile = OregonTrail.getLogFile();

    public static void display(String className, String errorMessage) {

        errorFile.println(
                "-----------------------------------"
                + "\n -Error- " + errorMessage
                + "\n ---------------------------------");
        // log the error
        logFile.println(className + " - " + errorMessage);
        OregonTrail.pressAnyKeyToContinue();
    }
} 