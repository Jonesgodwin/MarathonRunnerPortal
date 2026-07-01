package com.marathon.service;

import com.marathon.model.User;
import com.marathon.util.AuditLogger;
import com.marathon.util.DataStore;

public class LoginService {

    private final DataStore store = DataStore.getInstance();
    private final AuditLogger logger = AuditLogger.getInstance();

    public boolean login(String email, String password) {

        for (User user : store.getUsers()) {
            if (user.getEmail().equalsIgnoreCase(email)
                    && user.getPassword().equals(password)) {
                logger.log("Login success for: " + email);
                return true;
            }
        }

        logger.log("Login failed for: " + email);
        return false;
    }
}