package edu.neu.cs4500.models;

/**
 * Class to represent the user of a web-application.
 */
public class User {
    // Fields that a User has
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    /*
     * GETTERS AND SETTERS
     */
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}
