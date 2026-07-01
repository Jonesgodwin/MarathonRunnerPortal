package com.marathon.model;

import java.time.LocalDateTime;

public class User {

    public static final String ROLE_RUNNER = "RUNNER";
    public static final String ROLE_ADMIN = "ADMIN";

    private final int userId;
    private final String username;
    private final String email;
    private final String password;
    private final int age;
    private final String role;
    private int marathonPoints;
    private boolean verified;
    private String status;
    private final LocalDateTime createdAt;

    public User(int userId,
                String username,
                String email,
                String password,
                int age,
                String role) {

        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.role = role;
        this.createdAt = LocalDateTime.now();
        this.status = "PENDING";
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public int getMarathonPoints() {
        return marathonPoints;
    }

    public void setMarathonPoints(int marathonPoints) {
        this.marathonPoints = marathonPoints;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}