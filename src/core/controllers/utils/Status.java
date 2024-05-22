
package core.controllers.utils;


public abstract class Status {
    
    // Succesful Response
    public static final int OK = 200;
    public static final int CREATED = 201;
    public static final int NO_CONTENT = 204;
    
    // User-Error Response
    public static final int BAD_REQUEST = 400;
    public static final int NOT_FOUND = 404;
    
    // Server-Error Response    
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int NOT_IMPLEMENTED = 501;
}
