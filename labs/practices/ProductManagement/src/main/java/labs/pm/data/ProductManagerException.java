package labs.pm.data;

public class ProductManagerException extends Exception {

    /**
     * 
     */
    public ProductManagerException() {
    }

    /**
     * @param message
     */
    public ProductManagerException(String message) {
        super(message);
    }

    /**
     * @param message
     * @param cause
     */
    public ProductManagerException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
