package com.marathon.model;

import java.time.LocalDate;

public class TrainingLog {

    private final int logId;
    private final int userId;
    private final double distance;
    private final int duration;
    private final LocalDate trainingDate;

    public TrainingLog(int logId,
                       int userId,
                       double distance,
                       int duration,
                       LocalDate trainingDate) {
        this.logId = logId;
        this.userId = userId;
        this.distance = distance;
        this.duration = duration;
        this.trainingDate = trainingDate;
    }

    public int getLogId() {
        return logId;
    }

    public int getUserId() {
        return userId;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }
}