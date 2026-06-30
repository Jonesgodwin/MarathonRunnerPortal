package com.marathon.model;

import java.time.LocalDateTime;

public class Race {

    private int raceId;
    private String raceName;
    private String distance;
    private String location;
    private LocalDateTime raceDate;
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
}