package com.user_management.exception_handling.service;

import com.user_management.exception_handling.exception.UserNotFoundException;
import com.user_management.exception_handling.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserById(Long id){
        if(id<=0){
            throw  new UserNotFoundException("User not found");
        }
        return "User with ID: " +id;
    }
}
