package com.scm.scm20.helper;

/**
 * Custom exception thrown when a requested resource is not found in the application.
 * Used for error handling in service and controller layers.
 */
public class ResourceNotFoundException extends RuntimeException {

    /**
     * Constructs a new exception with a specific message.
     * @param message the detail message
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with a default message.
     */
    public ResourceNotFoundException() {
        super("Resources not found");
    }

}
