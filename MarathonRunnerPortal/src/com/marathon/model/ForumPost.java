package com.marathon.model;

public class ForumPost {

    private int postId;
    private int userId;
    private String content;
    private String status;

    public ForumPost(int postId,
                     int userId,
                     String content) {

        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.status = "PENDING";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}