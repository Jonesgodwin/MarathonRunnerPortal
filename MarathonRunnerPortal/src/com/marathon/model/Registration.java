package com.marathon.model;

import java.time.LocalDateTime;

public class Registration {

    private final int userId;
    private final int raceId;
    private final LocalDateTime registeredAt;

    public Registration(int userId, int raceId) {
        this.userId = userId;
        this.raceId = raceId;
        this.registeredAt = LocalDateTime.now();
    }

    public int getUserId() {
        return userId;
    }

    public int getRaceId() {
        return raceId;
    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }
}