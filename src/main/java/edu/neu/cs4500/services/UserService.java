package edu.neu.cs4500.services;

import edu.neu.cs4500.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Service for retrieving info on users from the API for each method.
 */
@RestController
public class UserService {

    // Create a hard-coded list of users to return when requested
    static List<User> users = new ArrayList();
    static {
        users.add(new User(123, "alice", "alice", "Alice", "Wonderland"));
        users.add(new User(234, "bob", "bob", "Bob", "Marley"));
    }

    /**
     * Gets a list of all the users for the application.
     * @return A list of all users.
     */
    @GetMapping("/api/user")
    public List<User> findAllUsers() {
        return users;
    }
}
