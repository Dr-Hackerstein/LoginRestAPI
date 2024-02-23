package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Admin;

public class AdminServiceImpl implements AdminService {
	
	@Autowired
    private AdminRepository adminRepository;

	@Override
	public Admin login(String adminname, String password) {
		// Find the user by username and password
        Admin user = adminRepository.findByAdminnameAndPassword(adminname, password);

        // Check if the user exists and the password is correct
        if (user == null) {
            throw new RuntimeException("Invalid username or password");
        }

        // Perform any additional validation or processing if needed

        return user;
	}

	@Override
	public void logout(Admin user) {
		
		
	}
	
	

}
