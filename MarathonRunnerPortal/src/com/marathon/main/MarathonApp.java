package com.marathon.main;

import com.marathon.factory.UserFactory;
import com.marathon.model.User;
import com.marathon.service.LoginService;
import com.marathon.service.RegistrationService;

public class MarathonApp {

    public static void main(String[] args) {

        RegistrationService regService =
                new RegistrationService();

        User runner =
                UserFactory.createRunner(
                        1,
                        "Jones",
                        "jones@gmail.com",
                        "Password@123",
                        25);

        regService.registerUser(runner);

        LoginService loginService =
                new LoginService();

        boolean success =
                loginService.login(
                        "jones@gmail.com",
                        "Password@123");

        System.out.println(
                "Login Success : "
                + success);
    }
}