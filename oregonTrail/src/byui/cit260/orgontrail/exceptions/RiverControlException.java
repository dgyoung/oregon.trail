package byui.cit260.orgontrail.exceptions;

/*
 * @author MasterCraft Computer
 */
public class RiverControlException extends Exception{
    
    public RiverControlException(){
    }
    
    public RiverControlException(String message){
        super(message);
    }
    public RiverControlException (Throwable cause){
        super(cause);
    }
    
    public RiverControlException(String message,
                                Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

