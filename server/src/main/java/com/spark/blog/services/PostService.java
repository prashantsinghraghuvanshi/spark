package com.spark.blog.services;

import com.spark.blog.domain.CreatePostRequest;
import com.spark.blog.domain.UpdatePostRequest;
import com.spark.blog.domain.entities.Post;
import com.spark.blog.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPost(UUID id);
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
    Post createPost(User user, CreatePostRequest createPostRequest);
    // TODO user authorization for post update i.e. use of User
    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);
}
