package com.marathon.model;

import java.time.LocalDate;

public class TrainingLog {

    private int logId;
    private int userId;
    private double distance;
    private int duration;
    private LocalDate trainingDate;

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

    public int getUserId() {
        return userId;
    }

    public double getDistance() {
        return distance;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }
}