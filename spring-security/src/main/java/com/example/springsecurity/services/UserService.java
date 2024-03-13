package com.example.springsecurity.services;

import java.util.List;

import com.example.springsecurity.dtos.UserResponse;
import com.example.springsecurity.dtos.UserRequest;

public interface UserService {

    UserResponse saveUser(UserRequest userRequest);

    UserResponse getUser();

    List<UserResponse> getAllUser();


}
