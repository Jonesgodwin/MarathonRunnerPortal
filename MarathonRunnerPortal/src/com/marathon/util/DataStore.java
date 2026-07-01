package com.marathon.util;

import com.marathon.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private static DataStore instance;

    private final List<User> users = new ArrayList<>();
    private final List<Race> races = new ArrayList<>();
    private final List<TrainingLog> trainingLogs = new ArrayList<>();
    private final List<Registration> registrations = new ArrayList<>();
    private final List<ForumPost> posts = new ArrayList<>();

    private DataStore() {
    }

    public static synchronized DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Race> getRaces() {
        return races;
    }

    public List<TrainingLog> getTrainingLogs() {
        return trainingLogs;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public List<ForumPost> getPosts() {
        return posts;
    }
}