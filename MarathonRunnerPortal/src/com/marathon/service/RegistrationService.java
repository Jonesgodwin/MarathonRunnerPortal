package com.marathon.service;

import com.marathon.model.User;
import com.marathon.util.AuditLogger;
import com.marathon.util.DataStore;

public class RegistrationService {


    private final DataStore store = DataStore.getInstance();
    private final AuditLogger logger = AuditLogger.getInstance();

    public boolean registerUser(User user) {
        validate(user);

        boolean exists = store.getUsers().stream()
                .anyMatch(u -> u.getEmail().equalsIgnoreCase(user.getEmail()));

        if (exists) {
            logger.log("Registration failed: duplicate email = " + user.getEmail());
            return false;
        }

        store.getUsers().add(user);
        logger.log("User registered: " + user.getEmail() + ", role=" + user.getRole());
        return true;
    }

    private void validate(User user) {
        if (user.getUsername() == null || user.getUsername().isBlank()) {
            throw new IllegalArgumentException("Username is required.");
        }
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new IllegalArgumentException("Valid email is required.");
        }
        String domain = user.getEmail().substring(user.getEmail().indexOf("@") + 1);
        if (!domain.equalsIgnoreCase("gmail.com") && !domain.equalsIgnoreCase("yahoo.com")) {
            throw new IllegalArgumentException("Email domain must be gmail.com or yahoo.com.");
        }
        if (user.getPassword() == null || user.getPassword().length() < 12 || !user.getPassword().matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            throw new IllegalArgumentException("Password must be at least 12 characters and include at least one special character.");
        }
        if (!(user.getAge() >= 18 && user.getAge() <= 40)) {
            throw new IllegalArgumentException("Age must be between 18 – 40.");
        }
    }
}