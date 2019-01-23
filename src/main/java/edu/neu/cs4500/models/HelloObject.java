package edu.neu.cs4500.models;

public class HelloObject {

    // The message associated with this HelloObject
    private String message;

    // Create a new instance of HelloObject with the given message
    public HelloObject(String message) {
        this.message = message;
    }

    // Default constructor
    public HelloObject() { }

    // Getter for the message tied to this HelloObject
    public String getMessage() {
        return message;
    }

    // Setter for the message tied to this HelloObject
    public void setMessage(String message) {
        this.message = message;
    }
}
