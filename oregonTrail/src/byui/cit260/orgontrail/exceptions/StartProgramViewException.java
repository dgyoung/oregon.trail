package byui.cit260.orgontrail.exceptions;

/*
 * @author Alexandra
 */
public class StartProgramViewException extends Exception{
    
    public StartProgramViewException() {
    }
    
    public StartProgramViewException(String messge) {
        super(message);
    }

    public StartProgramViewException (String message, Throwable cause){
        super(message, cause);
    }

    public StartProgramViewException (Throwable cause) {
        super(cause);
    }

    public StartProgramViewException(String messge, 
                                            Throwable cause, 
                                            boolean enableSuppression, 
                                            boolean writableStackTrace) 
                                            {
        super(message, cause, enableSuppression, writableStackTrace);
}

}
