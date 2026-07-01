package com.marathon.model;

public class ForumPost {

    private final int postId;
    private final int userId;
    private final String content;
    private String status;

    public ForumPost(int postId, int userId, String content) {
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.status = "PENDING";
    }

    public int getPostId() {
        return postId;
    }

    public int getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}