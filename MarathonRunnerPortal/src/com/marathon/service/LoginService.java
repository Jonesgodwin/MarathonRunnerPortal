package com.marathon.service;

import com.marathon.model.User;
import com.marathon.util.DataStore;

public class LoginService {

    private DataStore store =
            DataStore.getInstance();

    public boolean login(
            String email,
            String password) {

        for(User user : store.users) {

            if(user.getEmail().equals(email)
                    &&
               user.getPassword().equals(password)) {

                return true;
            }
        }

        return false;
    }
}