package com.example.facebookclone.Model;

import java.util.List;

public class PostModel {
    private String postId;
    private String postImage;
    private String postedBy;
    private long postedAt;
    private String postDescription;
    private int postLike;
    private int commentCount;

    public PostModel() {
    }


    public PostModel(String postId, String postImage, String postedBy, long postedAt, String postDescription) {
        this.postId = postId;
        this.postImage = postImage;
        this.postedBy = postedBy;
        this.postedAt = postedAt;
        this.postDescription = postDescription;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public long getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(long postedAt) {
        this.postedAt = postedAt;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public int getPostLike() {
        return postLike;
    }

    public void setPostLike(int postLike) {
        this.postLike = postLike;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
