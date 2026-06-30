package com.marathon.util;

import java.util.ArrayList;
import java.util.List;

import com.marathon.model.*;

public class DataStore {

    private static DataStore instance;

    private DataStore() {
    }

    public static DataStore getInstance() {

        if(instance == null) {
            instance = new DataStore();
        }

        return instance;
    }

    public List<User> users = new ArrayList<>();
    public List<Race> races = new ArrayList<>();
    public List<TrainingLog> trainingLogs = new ArrayList<>();
    public List<Registration> registrations = new ArrayList<>();
    public List<ForumPost> posts = new ArrayList<>();
}
