
package core.controllers.utils;


public class Response {
    
    private String message;
    private int status;
    private Object triggerer;
    
    // Constructor in case the triggerer is an object
    public Response( String message, int status, Object object){
        this.message = message;
        this.status = status;
        this.triggerer = object;
    }
    
   // Constructor in case the triggerer is undefined
    public Response( String message, int status){
        this.message = message;
        this.status = status;
        this.triggerer = null;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public Object getTriggerer() {
        return triggerer;
    }
    
    
}
