package byui.cit260.orgontrail.exceptions;

/*
 * @author David
 */
public class HuntControlException extends Exception{

    public HuntControlException() {
    }

    public HuntControlException(String message) {
        super(message);
    }

    public HuntControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public HuntControlException(Throwable cause) {
        super(cause);
    }

    public HuntControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
