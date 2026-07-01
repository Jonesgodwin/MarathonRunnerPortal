package com.marathon.main;

import com.marathon.factory.UserFactory;
import com.marathon.model.User;
import com.marathon.service.LoginService;
import com.marathon.service.RegistrationService;
import com.marathon.util.DataStore;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MarathonApp {

    private static int userIdSequence = 1;

    public static void main(String[] args) {

        RegistrationService registrationService = new RegistrationService();
        LoginService loginService = new LoginService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Marathon Runner Portal =====");
            System.out.println("1. Register Runner");
            System.out.println("2. Login");
            System.out.println("3. List Users");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1" -> {
                    try {
                        System.out.print("Username: ");
                        String username = scanner.nextLine();

                        System.out.print("Email: ");
                        String email = scanner.nextLine();

                        System.out.print("Password: ");
                        String password = scanner.nextLine();

                        System.out.print("Age: ");
                        int age = Integer.parseInt(scanner.nextLine());

                        User runner = UserFactory.createRunner(
                                userIdSequence++, username, email, password, age
                        );

                        boolean success = registrationService.registerUser(runner);
                        System.out.println(success
                                ? "User Registered Successfully."
                                : "Registration Failed (email already exists).");

                    } catch (Exception e) {
                        System.out.println("Registration Error: " + e.getMessage());
                    }
                }

                case "2" -> {
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    boolean success = loginService.login(email, password);
                    System.out.println("Login Success: " + success);
                }

                case "3" -> {
                    System.out.println("\n--- Registered Users ---");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    for (User user : DataStore.getInstance().getUsers()) {
                        System.out.println(
                                user.getUserId() + " | " +
                                        user.getUsername() + " | " +
                                        user.getEmail() + " | " +
                                        user.getRole() + " | points=" +
                                        user.getMarathonPoints()  + " | " +
                                        "Account Created at: " + user.getCreatedAt().format(formatter)
                        );
                    }
                }

                case "0" -> {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid option.");
            }
        }
    }
}