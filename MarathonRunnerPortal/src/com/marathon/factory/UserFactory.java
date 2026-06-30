package com.marathon.factory;

import com.marathon.model.User;

public class UserFactory {

    public static User createRunner(
            int id,
            String username,
            String email,
            String password,
            int age) {

        User user = new User(
                id,
                username,
                email,
                password,
                age,
                "RUNNER");

        user.setMarathonPoints(500);

        return user;
    }

    public static User createAdmin(
            int id,
            String username,
            String email,
            String password,
            int age) {

        return new User(
                id,
                username,
                email,
                password,
                age,
                "ADMIN");
    }
}