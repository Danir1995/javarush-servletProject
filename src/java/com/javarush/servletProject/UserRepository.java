package com.javarush.servletProject;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private final Map<String, User> users = new HashMap<>();

    public void save(User user) {
        users.put(user.getUserName(), user);
    }

    public User fetchByUsername(String username) {
        return users.get(username);
    }

    public boolean isExists(String username) {
        return users.containsKey(username);
    }
}
