package com.marathon.model;

import java.time.LocalDateTime;

public class User {

    private int userId;
    private String username;
    private String email;
    private String password;
    private int age;
    private String role;
    private int marathonPoints;
    private boolean verified;
    private String status;
    private LocalDateTime createdAt;

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}