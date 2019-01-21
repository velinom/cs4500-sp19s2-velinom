package edu.neu.cs4500.services;

import edu.neu.cs4500.models.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Service for retrieving info on users from the API for each method.
 */
@RestController
public class UserService {

    static List<User> users = new ArrayList();
    static {
        users.add(new User(123, "alice", "alice", "Alice", "Wonderland"));
        users.add(new User(234, "bob", "bob", "Bob", "Marley"));
    }

}
