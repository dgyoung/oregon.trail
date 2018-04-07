package byui.cit260.orgontrail.exceptions;

/**
 *
 * @author bradrallen
 */
public class ReportControlException extends Exception{

    public ReportControlException() {
    }

    public ReportControlException(String message) {
        super(message);
    }

    public ReportControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReportControlException(Throwable cause) {
        super(cause);
    }

    public ReportControlException(String message, 
                                Throwable cause,
                                boolean enableSuppression, 
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}