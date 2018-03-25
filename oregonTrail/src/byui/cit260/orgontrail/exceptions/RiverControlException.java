/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.orgontrail.exceptions;

/**
 *
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
                                boolean writableStackTrace)
                                {
    super(message, cause, enableSuppression, writableStackTrace);
    }
}

