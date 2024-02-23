package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
	
    User register(User user);
    User login(String username, String password);
    void logout(User user);
    
    
    //The next methods will give me the CRUD operations for user
    
    List<User> getAllUsers();
    User getUserById(int userId);
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(int userId);
    
}
