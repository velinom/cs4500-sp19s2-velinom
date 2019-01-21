package edu.neu.cs4500.services;

import edu.neu.cs4500.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * Gets a specific user by their unique user Id
     * @param id The Id of the user to search for.
     * @return The user associated with the given Id, or null if there is none.
     */
    @GetMapping("/api/user/{userId}")
    public User findUserById(@PathVariable("userId") Integer id) {
        for (User user : users) {
            if (user.getId().equals(id)) return user;
        }

        // If there was no user with the given id
        return null;
    }
}
