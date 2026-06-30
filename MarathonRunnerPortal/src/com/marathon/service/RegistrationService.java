package com.marathon.service;

import com.marathon.model.User;
import com.marathon.util.DataStore;

public class RegistrationService {

    private DataStore store =
            DataStore.getInstance();

    public void registerUser(User user) {

        store.users.add(user);

        System.out.println(
                "User Registered Successfully");
    }
}