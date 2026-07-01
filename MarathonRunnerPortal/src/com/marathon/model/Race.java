package com.marathon.model;

import java.time.LocalDateTime;

public class Race {

    private final int raceId;
    private final String raceName;
    private final String distance;
    private final String location;
    private final LocalDateTime raceDate;
    private boolean registrationOpen;

    public Race(int raceId,
                String raceName,
                String distance,
                String location,
                LocalDateTime raceDate) {
        this.raceId = raceId;
        this.raceName = raceName;
        this.distance = distance;
        this.location = location;
        this.raceDate = raceDate;
        this.registrationOpen = true;
    }

    public int getRaceId() {
        return raceId;
    }

    public String getRaceName() {
        return raceName;
    }

    public String getDistance() {
        return distance;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getRaceDate() {
        return raceDate;
    }

    public boolean isRegistrationOpen() {
        return registrationOpen;
    }

    public void setRegistrationOpen(boolean registrationOpen) {
        this.registrationOpen = registrationOpen;
    }
}