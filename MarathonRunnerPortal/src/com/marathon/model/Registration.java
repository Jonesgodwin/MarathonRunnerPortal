package com.marathon.model;

import java.time.LocalDateTime;

public class Registration {

    private int userId;
    private int raceId;
    private LocalDateTime registeredAt;

    public Registration(int userId,
                        int raceId) {

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
}