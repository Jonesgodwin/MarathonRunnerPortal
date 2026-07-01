package com.marathon.util;

public class AuditLogger {

    private static AuditLogger instance;

    private AuditLogger() {
    }

    public static synchronized AuditLogger getInstance() {

        if(instance == null) {
            instance = new AuditLogger();
        }

        return instance;
    }

    public void log(String message) {

        System.out.println(
                "[AUDIT] " + message);
    }
}