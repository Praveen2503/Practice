package Homework;

public class DuplicateFlagsException extends Exception {
    
    // Constructor that passes the message to the base Exception class
    public DuplicateFlagsException(String message) {
        super(message);
      
    }

    // Override getMessage() to customize the output
    @Override
    public String getMessage() {
        return "The error happened because: " + super.getMessage();
    }
}
