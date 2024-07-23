package com.semicolon.africa.demo_sorosokey.service;

import com.semicolon.africa.demo_sorosokey.dto.CommentRequest;
import com.semicolon.africa.demo_sorosokey.dto.CommentResponse;
import com.semicolon.africa.demo_sorosokey.dto.UserRequest;
import com.semicolon.africa.demo_sorosokey.dto.UserResponse;

public interface UserServices {

    UserResponse signUp(UserRequest userRequest);
    CommentResponse commentToPost(CommentRequest commentRequest)
    CommentResponse deleteCOmment(CommentResponse commentResponse)
    SharePostResponse sharePost (SharePostRequest sharePostRequest)
}
