package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(User user) {
    	// Check if the user already exists
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new RuntimeException("Username already exists");
        }
        
        return userRepository.save(user);
    }

    @Override
    public User login(String username, String password) {
    	// Find the user by username and password
        User user = userRepository.findByUsernameAndPassword(username, password);

        // Check if the user exists and the password is correct
        if (user == null) {
            throw new RuntimeException("Invalid username or password");
        }

        // Perform any additional validation or processing if needed

        return user;
    }

    @Override
    public void logout(User user) {
    
    }
    
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
    
}