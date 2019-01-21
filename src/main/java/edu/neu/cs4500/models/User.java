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

    /**
     * Creates a new instance of user and populates it with the given information.
     * @param id         The unique id for this user.
     * @param username   The username.
     * @param password   The user's password, stored in plaintext.
     * @param firstName  The user's first name.
     * @param lastName   The user's last name.
     */
    public User(Integer id, String username, String password, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

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
